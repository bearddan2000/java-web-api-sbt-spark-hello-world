package example;

import static spark.Spark.*;

public class HelloWorldService {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello, World");

        get("/:name", (req, res) -> {
            return "Hello: " + req.params(":name");
        });
    }
}
