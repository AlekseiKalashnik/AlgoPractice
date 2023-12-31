package codewars.kyu8;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi <= 18.5 ? "Underweight"
                : bmi <= 25.0 ? "Normal"
                : bmi <= 30.0 ? "Overweight"
                : "Obese";
    }

    //Write function bmi that calculates body mass index (bmi = weight / height2).
    //if bmi <= 18.5 return "Underweight"
    //if bmi <= 25.0 return "Normal"
    //if bmi <= 30.0 return "Overweight"
    //if bmi > 30 return "Obese"
}
