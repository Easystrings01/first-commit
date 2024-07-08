package Home;

public class Switchupdated {
    public static void main(String[] args) {

        String day = "friday";
        String result = "";

        result = switch(day)
        {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default-> "7am";

        };
        System.out.println(result);

    }


}
