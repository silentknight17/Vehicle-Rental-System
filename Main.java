package com.company;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class customer{
    public String name;
    public String phone_number;
    public String Vehicle_type;
    public int run;
    public double amount;

    customer(String name,String phone_number,String Vehicle_type, int run,double amount)
    {
        this.name=name;
        this.phone_number=phone_number;
        this.Vehicle_type=Vehicle_type;
        this.run=run;
        this.amount=amount;
    }

    public void display()
    {
        System.out.println("Customer name :"+name);
        System.out.println("Phone Number :"+phone_number);
        System.out.println("Vehicle Type :"+Vehicle_type);
        System.out.println("KM run :"+run);
        System.out.println("Total Price :"+amount);

    }

}

public class Main {

    public static void main(String[] args)throws IOException{
	// write your code here
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader bin=new BufferedReader(in);
        customer[] arr;
        arr=new customer[10000];
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        System.out.println("Welcome to the Vehicle Rental System on "+timeStamp);
        System.out.println("Press 4 to exit out of the system!");

        System.out.println("Enter any number other than 4 to enter into the system!");
        int ch=Integer.parseInt(bin.readLine());
        if(ch==4)
            return;
        int x=0;
        do{


            System.out.println("Enter the customer's details");
            String name=bin.readLine();
            String phone=bin.readLine();
            String vehicle=bin.readLine();
            int run=Integer.parseInt(bin.readLine());
            double amt=run*1.5;          // Calculating the amount taking ₹1.5 per km
            arr[x++]=new customer(name,phone,vehicle,run,amt);

            System.out.println("Press 1- For displaying the customer's details else press 2 to continue");
            int c=Integer.parseInt(bin.readLine());

            if(c==1)
            {
                System.out.println("The customer's details stored are as follows-");
                for(int i=0;i<x;i++)
                {
                    arr[i].display();
                    System.out.println();
                }

            }
            System.out.println("Press 4 to stop the execution or else press any other key to continue");
            int y=Integer.parseInt(bin.readLine());
            if(y==4)
                break;
        }
        while(true);

    }
}
