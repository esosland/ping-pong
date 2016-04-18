import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import  java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}
    // String layout = "templates/layout.vtl";
    //
    //     get("/", (request, response) -> {
    //       Map<String, Object> model = new HashMap<String, Object>();
    //       model.put ("template", "templates/home.vtl");
    //       return new ModelAndView(model, layout);
    //     }, new VelocityTemplateEngine());
    //
    //     get("/results", (request, response) -> {
    //       Map<String, Object> model = new HashMap<String, Object>();
    //       model.put("template", "templates/results.vtl");
    //
    //       Integer number = request.queryParams(number);
    //       // Integer integerYear = Integer.parseInt(year);
    //       ArrayList isPingPong = isPingPong(number);
    //
    //       model.put("isPingPong", isPingPong);
    //       model.put("number", request.queryParams("number"));
    //       return new ModelAndView(model, layout);
    //     }, new VelocityTemplateEngine());
    //   }

    public static ArrayList isPingPong(Integer number) {
      ArrayList<Object> numbersArrayList = new ArrayList<Object>();
      for (int i = 1; i <= number; i++){
        if (i % 15 == 0){
          numbersArrayList.add("PingPong");
      } else if (i % 5 == 0) {
          numbersArrayList.add("Pong");
      } else if (i % 3 == 0) {
          numbersArrayList.add("Ping");
      } else {
          numbersArrayList.add(i);
        }
      }
      //get number and then count up until we reach that number, and add each "step" to an arrayList,

      return numbersArrayList;
    // (ul#results).add("<li>" + numbersArrayList + "</li>");
    }
}
