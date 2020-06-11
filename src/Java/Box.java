package Java;

import org.w3c.dom.ls.LSOutput;

public class Box {
    int size=5;
    int top=-1;
    int arr[]=new int[size];



    public void addToBox(int x) {

        if(top<size){
            arr[++top]=x;

        }
        else
        {

            System.out.println("Box is full:");
        }

    }
    public void print(){

       for(int i=size-1;i>=0;i--){
           System.out.println(arr[i]);
       }

    }



    }
