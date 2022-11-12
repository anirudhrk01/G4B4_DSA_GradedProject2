package com.dsa.q1.Skyscrapermain;

import java.util.Scanner;

import com.dsa.q1.Skyscrapermethod.Constructed;

public class Assemble {

	public static void main(String[] args) {
		
		try (
				
				Scanner sc = new Scanner(System.in)){
			
          			System.out.println("enter the total no of floors in the building");

    			       int noOffloor = sc.nextInt();
 
                       int floors[] = new int[noOffloor];

		            	for (int i = 0; i < noOffloor; i++) {
			                   
		            		System.out.println("enter the floor size given on day : " + (i + 1));
				            
		            		floors[i] = sc.nextInt();
			             }
			
		            	System.out.println();

		            	Constructed c = new Constructed();
		             	c.structure(floors, noOffloor);
		
		              }
	          }
      }
