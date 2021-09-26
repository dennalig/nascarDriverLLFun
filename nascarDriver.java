public class nascarDriver{
  //nascar driver class
    nascarDriver next;
    int number;
    String driverName;
    int chasePoints;


    public nascarDriver(int number, String driverName,int chasePoints){
        this.number=number;
        this.driverName=driverName;
        this.chasePoints= chasePoints;

    }

    public static void main(String[] args){
        startingLineup Daytona= new startingLineup();
        
        

        Daytona.addToField(11, "Denny Hamlin",645965);
        Daytona.addToField(88, "Alex Bowman", 545353);
        Daytona.addToField(9, "Chase Elliot", 5466);
        Daytona.addToField(4, "Kevin Harvick",5646);
        Daytona.addToField(14, "Martin Truex Jr.",88969);
        Daytona.addToField(22, "Joey Logano",58358);


    Daytona.sortByNumberAscending();
    // Daytona.removeDriverWithNumber(11);
    // Daytona.sortByNumberDescending();
    // Daytona.removeRacerFromField("Denny Hamlin");
    // Daytona.removeEvenPlacedRacers();
    Daytona.printField();
    }

}

