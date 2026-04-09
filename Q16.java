import pack16.*;

public class Q16 {
    public static void main(String[] args) {

        System.out.println("---- Undergraduate ----");
        UnderGraduate ug = new UnderGraduate("GTU", 55);
        ug.checkAdmission();

        System.out.println("\n---- Postgraduate ----");
        PostGraduate pg = new PostGraduate("GTU", 45);
        pg.checkAdmission();
    }
}