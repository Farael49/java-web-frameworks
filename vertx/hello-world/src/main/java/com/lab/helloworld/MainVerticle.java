package com.lab.helloworld;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class MainVerticle extends AbstractVerticle {
  private static long startTime;

  // Convenience method to run it in the IDE
  public static void main(String[] args) {
    startTime = System.currentTimeMillis();
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {

    Router router = Router.router(vertx);
    router.route().handler(BodyHandler.create());
    router.get("/test/hello").handler(this::hello);

    vertx.createHttpServer()
      .requestHandler(router)
      .listen(8080, http -> {
        if (http.succeeded()) {
          startPromise.complete();
          System.out.println("HTTP server started in " + (System.currentTimeMillis() - startTime) + "ms");
        } else {
          startPromise.fail(http.cause());
        }
      });
  }

  private void hello(RoutingContext routingContext) {
    routingContext.response().end("Hello World");
  }
}
