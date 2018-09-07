//This Program is to find minimum no. of drops from floor required for eggs to break.
//Input: No. of eggs and No. of Floors.
//Output: Minimum drops count.
public class EggDropREcursion {
 public static int getDrops(int eggs, int floors) {
	 // case 1:
	 // if floors = 0 then no drops are required and if floors = 1 then 1 drop is required
	 if(floors==1 || floors==0) 
		 return floors;
	 
	 // case 2:
	 //if only 1 egg is there then drops = floors
	 if(eggs == 1) 
		 return floors;
	 
	 int minimumDrops = Integer.MAX_VALUE;
	 int tempResult;
	 //check dropping from all the floors and check minimum among those
	 // for every drop there are 2 scenarios a> the egg will break b> the egg will not break
	 for(int i=1; i<=floors; i++) {
		 // for the worst case pick the maximum among a and b
		 tempResult = Math.max(getDrops(eggs-1,i-1), getDrops(eggs, floors-i));
         minimumDrops = Math.min(tempResult,minimumDrops);
	 }
	 return minimumDrops + 1;
 }
 public static void main(String[] args) {
	 EggDropREcursion obj = new EggDropREcursion();
	 int eggs = 2;
	 int floors = 10;
	 System.out.print("(Recursion) Minimum number of drops required in worst case with eggs: " + eggs + " and floors:" + floors + " is: " + EggDropREcursion.getDrops(eggs,floors));
 }
}
