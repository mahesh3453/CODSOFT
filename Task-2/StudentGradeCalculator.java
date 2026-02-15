package in.codesoft.tasks;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do {
			System.out.print("Enter number of subjects: ");
			int subjects = sc.nextInt();
			int total = 0;
			boolean isFail = false;
			
			for(int i = 1; i <= subjects; i++) {
				System.out.print("Enter marks for subject "+(i)+" :");
				int marks = sc.nextInt();
				if(marks < 0 || marks>100) {
					System.out.print("Invalid marks! Re-enter.");
					i--;
					continue;
				}
				total+=marks;
				if(marks < 35) {
					isFail = true;
				}
			}
			 	double percentage = (double) total / subjects;
	            String grade = calculateGrade(percentage);
	            String remark = performanceRemark(percentage);
	            
	            System.out.println("\n========== RESULT ==========");
	            System.out.println("Total Marks        : " + total);
	            System.out.printf("Average Percentage : %.2f%%\n", percentage);
	            System.out.println("Grade              : " + grade);
	            System.out.println("Remark             : " + remark);
	            System.out.println("Status             : " + (isFail ? "FAIL" : "PASS"));
	            
	            String division = percentage >= 75?"Distinction":
	            					     percentage>=60?"First Class":
	            						    percentage>=50?"Second Class"
	            								          :"Third Class";
	            						    
	            System.out.println("Division           : "+division);						    
	            
                System.out.print("\nDo you want to evaluate another student? (y/n): ");
	            ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		sc.close();
	}
	private static String calculateGrade(double percentage) {
         return percentage >= 90 ? "A+":
        	 		percentage >= 80 ? "A":
        	 		percentage >= 70 ? "B":
        	 		percentage >= 60 ? "C":
        	 		percentage >= 50 ? "D":"F";
    }
	
	private static String performanceRemark(double percentage) {
       return percentage >= 85?"Excellent Performance":
	          percentage >= 70?"Very Good":
	        	  percentage >= 55?"Good":
	          percentage >= 40?"Needs Improvement":"Poor";
        }
}
