package com.company;

import java.util.Scanner;





/*
   . create a class called Main
   . prompt the user
   . List out all the string files a user to enter
   . create declare boolean value and do with a  while loop
   . import the Scanner
*/





public class Main {


    public static void main(String[] args) {
        Scanner Z = new Scanner( System.in );
        Employee employee = new Employee();
        ;
        boolean Y;
        //  String PersonalInformation;
        String name;
        String emailaddress;
        String company;
        //  String EXPERIANCE ;
        String jobtitle;
        String startdate;
        String enddate;
        String jobdescription;
        String d;
        boolean x;

        boolean list = true;
        while (list) {
            System.out.println( "*********EMPLOYEE RESUME********** " );

            //System.out.println("Do you want to add a resume ?"  );
            System.out.println( "1.PERSONAL INFORMATION " );
            System.out.println( "please enter a name?" );
            name = Z.nextLine();
            employee.setName( name );

            System.out.println( "please enter emailaddress" );
            emailaddress = Z.nextLine();
            employee.setEmailaddress( emailaddress );

            System.out.println( "2.EXPERIENCE" );

            System.out.println( "company" );
            company = Z.nextLine();
            employee.setCompany( company );

            System.out.println( "please enter a jobtitle" );
            jobtitle = Z.nextLine();
            employee.setJobtitle( jobtitle );
            System.out.println( "please enter a startdate" );
            startdate = Z.nextLine();
            employee.setStartdate( startdate );
            System.out.println( "please enter an enddate" );
            enddate = Z.nextLine();
            employee.setEnddate( enddate );
            System.out.println( "please enter a jobdescription" );
            jobdescription = Z.nextLine();
            employee.setJobdescription( jobdescription );

            // System.out.println( "Do you want to create employee list \n enter yes/ no ?" );
            System.out.println( "Enter name: " + employee.getName() + " \n\n Enter emailaddress: " + employee.getEmailaddress() + "\n Enter company: " + employee.getCompany() + "\n  Enter jobtitle:" + employee.getJobtitle() +
                    "\n Enter start date:" + employee.getStartdate() + "\n  Enter end date :" + employee.getEnddate() + "\n Enter job description :" + employee.getJobdescription() );


            System.out.println( "Do you want to create employee list ?" );
            String input = Z.nextLine();

            if (input.equals( "yes" )) {
                //   System.out.println( "Do you want to create employee list ?" );
                list = true;
            }
            else {
                list = false;
            }
        }

    }
}




