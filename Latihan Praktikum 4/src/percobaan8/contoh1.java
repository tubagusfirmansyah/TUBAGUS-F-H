/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan8;

/**
 *
 * @author Tubagus Firmansyah Hidayat
 */
public class contoh1 {

    public static void main( String[] args ){
        String status = "";
        int grade = 80;

        //mendapatkan status pelajar
        status = (grade >= 60)?"Passed":"Fail";

        //print status
        System.out.println( status );
    }
}
