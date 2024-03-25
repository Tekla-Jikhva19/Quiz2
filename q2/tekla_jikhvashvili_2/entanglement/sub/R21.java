package quizes.q2.salome_kikilashvili_2.kinetics.sub;
import quizes.q2.salome_kikilashvili_2.kinetics.A21;
import quizes.q2.salome_kikilashvili_2.hop.A22;

public class R21 {
    public static void main(String[] args) {

        // Calculate the area of the rectangle
        int area = A21.hei * A21.len;
        System.out.println("Area of the rectangle: " + area);

        String monthName;
        switch (A22.month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;
        }
        System.out.println("Month name: " + monthName);
    }
}