public class startingLineup{

    public nascarDriver polePosition;  //head

    public void addToField(int number, String name, int chasePoints){
        nascarDriver currentDriver=polePosition;

        if (polePosition==null){
            polePosition=new nascarDriver(number, name, chasePoints);
            return;
        }
        while(currentDriver.next!=null){
            currentDriver=currentDriver.next;
        }
        currentDriver.next= new nascarDriver(number, name,chasePoints);
        return;
    }
	
	//

    public void printField(){
        nascarDriver currentDriver=polePosition;

        System.out.println("---Starting Field---");
    int fieldPos=0;
        while(currentDriver!=null){
            fieldPos++;
            System.out.println(fieldPos+ ": "+ currentDriver.driverName+ ", "+ currentDriver.number + " Pts.: "+ currentDriver.chasePoints);
            currentDriver=currentDriver.next;
        }
    }

     public void sortByNumberAscending(){
                nascarDriver currentDriver=null;
                int tempDriverNumber=0;
                String tempDriverName="";
                int tempCP=0;
                boolean checkSwitch=false;
            

                do{

                    checkSwitch=false;
                    for(currentDriver=polePosition;currentDriver!=null;currentDriver=currentDriver.next){ //for loop that loops through linked list
                        if(currentDriver.next!=null&& currentDriver.next.number<currentDriver.number){ //checks that node.next!=null

                        tempDriverNumber=currentDriver.number;
                        tempDriverName=currentDriver.driverName;
                        tempCP=currentDriver.chasePoints;

                        currentDriver.number=currentDriver.next.number;
                        currentDriver.driverName=currentDriver.next.driverName;
                        currentDriver.chasePoints=currentDriver.next.chasePoints;

                        currentDriver.next.number=tempDriverNumber;
                        currentDriver.next.driverName=tempDriverName;
                        currentDriver.next.chasePoints=tempCP;

                        checkSwitch=true;
                        }
                        
                    }
                }while(checkSwitch);
            }

    public void sortByNumberDescending(){

        nascarDriver currentDriver=null;
        int tempDriverNumber=0;
        String tempDriverName="";
        int tempCP=0;
        boolean checkSwitch=false;
    

        do{

            checkSwitch=false;
            for(currentDriver=polePosition;currentDriver!=null;currentDriver=currentDriver.next){ //for loop that loops through linked list
                if(currentDriver.next!=null&& currentDriver.next.number>currentDriver.number){ //checks that node.next!=null

                tempDriverNumber=currentDriver.number;
                tempDriverName=currentDriver.driverName;
                tempCP=currentDriver.chasePoints;

                currentDriver.number=currentDriver.next.number;
                currentDriver.driverName=currentDriver.next.driverName;
                currentDriver.chasePoints=currentDriver.next.chasePoints;

                currentDriver.next.number=tempDriverNumber;
                currentDriver.next.driverName=tempDriverName;
                currentDriver.next.chasePoints=tempCP;

                checkSwitch=true;
                }
                
            }
        }while(checkSwitch);
        
    }

    public void removeRacerFromField(String racer){
        nascarDriver currentDriver= polePosition;

        while(currentDriver!=null){
            if(currentDriver.next.driverName==racer){
                currentDriver.next=currentDriver.next.next;
                return;
            }
            currentDriver=currentDriver.next;
        }
    }
    public void removeEvenPlacedRacers(){
        nascarDriver currentDriver= polePosition;
      
        while(currentDriver.next!=null){
            currentDriver.next=currentDriver.next.next;
            System.out.println(currentDriver.driverName);
          currentDriver=currentDriver.next;
        }
        

        
      
    }
    public void removeDriverWithNumber(int num){
        nascarDriver currentDriver= polePosition;

        while(currentDriver!=null){
            if(currentDriver.next.number==num){
                currentDriver.next=currentDriver.next.next;

                return;
            }
            currentDriver=currentDriver.next;
        }
    }

}