import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import  java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

    public static ArrayList isPingPong(Integer number) {
      ArrayList<Object> numbersArrayList = new ArrayList<Object>();
      for (int index = 1; index <= number; index++){
      numbersArrayList.add(index);
}
      //get number and then count up until we reach that number, and add each "step" to an arrayList,

      //then return ArrayList.
      return numbersArrayList;
    }
}
