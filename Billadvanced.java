import java.util.*;
public class Billadvanced
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        // declaring the price of a person in the buffet
        double priceofadult = 15.00;
        double priceofchildren = 10.00;
        double priceoftoddler = 00;

        // declaring the total price variable
        double total = 0.00;

        // declaring the drinks prices variables
        double Sprite = 2.50;
        double Pepsi = 2.50;
        double Fanta = 2.50;
        double Nestea = 2.50;
        double CocaCola = 2.50;
        double AppleJuice = 2.00;
        double OrangeJuice = 2.00;
        double Vodka = 3.00;
        double Wine = 3.00;
        double Water = 1.50;

        // creating the list
        List<String> drinksmenu=new ArrayList<String>();
        // adding the elements to the list
        drinksmenu.add("Sprite = $2.50");
        drinksmenu.add("Pepsi = $2.50");
        drinksmenu.add("Fanta = $2.50");
        drinksmenu.add("Nestea = $2.50");
        drinksmenu.add("Coca-Cola = $2.50");
        drinksmenu.add("Apple Juice = $2.00");
        drinksmenu.add("Orange Juice = $2.00");
        drinksmenu.add("Vodka = $3.00");
        drinksmenu.add("Wine = $3.00");
        drinksmenu.add("Water = $1.50");

        // outputing the series of questions asking how many people of each category will be dining here today
        System.out.println("How many adults(16+) will be dining here today? ");
        int numberofadults = input.nextInt();
        System.out.println("How many children(4-16) will be dining here today? ");
        int numberofchildren = input.nextInt();
        System.out.println("How many toddlers(0-4) will be dining here today? ");
        int numberoftoddlers = input.nextInt();

        // declaring and assigning a variable of where it calculates the total people
        int totalpeople = numberofadults + numberofchildren + numberoftoddlers;

        // declaring a variable which is assigned to calculating the price of a specific category of the people getting served 
        double totalPRA = numberofadults * priceofadult;
        double totalPRC = numberofchildren * priceofchildren;
        double totalPRT = numberoftoddlers * priceoftoddler;

        // adding the total the price of a specific category of the people getting served to the total
        total = total + totalPRA;
        total = total + totalPRC;
        total = total + totalPRT;

        // declaring the variable of how many of that drink type is getting ordered
        int totalvodka = 0;
        int totalsprite = 0;
        int totalfanta = 0;
        int totalnestea = 0;
        int totalcocacola = 0;
        int totalapplejuice = 0;
        int totalorangejuice = 0;
        int totalpepsi = 0;
        int totalwine = 0;
        int totalwater = 0;

        // outputting to the user if he would like a drink or not
        System.out.println("Would you like anything to drink? type Y if you do and N if you don't");
        //him inputting the answer through the variable called 'drinkyorn'
        String drinkyorn = string.nextLine();
        // creating a while loop to inform the user if they misspelled the answer, and asking them to input it again
         while (!drinkyorn.equals("Y") && !drinkyorn.equals("N")) {
            System.out.println("You did not enter 'Y' or 'N' here is another chance to type it correctly");
            System.out.println("Would you like anything to drink? type Y if you do and N if you don't"); 
            drinkyorn = string.nextLine();
        } 
        String drink1 = "0";
        // creating an if statement where if the user says yes I ask him which drink he would like by showing him the drink menu
        if (drinkyorn.equals("Y")) {
            // presenting the drink menu and asking the user which drink they would like
            System.out.println("Here is the drinks menu, just input the drinks name you wish to consume");
            System.out.println(drinksmenu);
            drink1 = string.nextLine();
            // if the input equals the the correct name of a drink on the menu than i add the drink value to the total and add it a value of 1 to the total of that drink ordered 
            if (drink1.equals("Sprite")) {
                total = total + Sprite;
                totalsprite = totalsprite + 1;
            }
            if (drink1.equals("Pepsi")) {
                total =total + Pepsi;
                totalpepsi = totalpepsi + 1;
            }
            if (drink1.equals("Vodka")) {
                total = total + Vodka;
                totalvodka = totalvodka + 1;
            }
            if (drink1.equals("Wine")) {
                total = total + Wine;
                totalwine = totalwine + 1;
            }
            if (drink1.equals("Fanta")) {
                total = total + Fanta;
                totalfanta = totalfanta + 1;
            }
            if (drink1.equals("Coca-Cola")) {
                total =total + CocaCola;
                totalcocacola = totalcocacola + 1;
            }
            if (drink1.equals("Nestea")) {
                total =total + Nestea;
                totalnestea = totalnestea + 1;
            }
            if (drink1.equals("Water")) {
                total = total + Water;
                totalwater = totalwater + 1;
            }
            if (drink1.equals("Apple Juice")) {
                total = total + AppleJuice;
                totalapplejuice = totalapplejuice + 1;
            }
            if (drink1.equals("Orange Juice")) {
                total = total + OrangeJuice;
                totalorangejuice = totalorangejuice + 1;
            }

            // if the input does not equal a drink than i output that he misspelled the input
            if(!drink1.equals("Orange Juice") && !drink1.equals("Apple Juice") && !drink1.equals("Wine") && !drink1.equals("Vodka") && !drink1.equals("Nestea") && !drink1.equals("Pepsi") && !drink1.equals("Sprite") && !drink1.equals("Fanta") && !drink1.equals("Coca-Cola") && !drink1.equals("Water")) {
                System.out.println("You misspelled the drink, please enter it again");
            }
        }

        // while the drink does not equal 0, meaning they still want another drink i ask the same question of what drink he wants over and over again
        while(!drink1.equals("0")) {
            System.out.println("If you would like another here is the drinks menu, just input the drinks name you wish to consume. If you do not want another drink anymore than type 0");
            System.out.println(drinksmenu);
            drink1 = string.nextLine();
            if (drink1.equals("Sprite")) {
                total = total + Sprite;
                totalsprite = totalsprite + 1;
            }
            if (drink1.equals("Pepsi")) {
                total =total + Pepsi;
                totalpepsi = totalpepsi + 1;
            }
            if (drink1.equals("Vodka")) {
                total = total + Vodka;
                totalvodka = totalvodka + 1;
            }
            if (drink1.equals("Wine")) {
                total = total + Wine;
                totalwine = totalwine + 1;
            }
            if (drink1.equals("Fanta")) {
                total = total + Fanta;
                totalfanta = totalfanta + 1;
            }
            if (drink1.equals("Coca-Cola")) {
                total =total + CocaCola;
                totalcocacola = totalcocacola + 1;
            }
            if (drink1.equals("Nestea")) {
                total =total + Nestea;
                totalnestea = totalnestea + 1;
            }
            if (drink1.equals("Water")) {
                total = total + Water;
                totalwater = totalwater + 1;
            }
            if (drink1.equals("Apple Juice")) {
                total = total + AppleJuice;
                totalapplejuice = totalapplejuice + 1;
            }
            if (drink1.equals("Orange Juice")) {
                total = total + OrangeJuice;
                totalorangejuice = totalorangejuice + 1;
            }

            // if the input does not equal a drink than i output that he misspelled the input
            if(!drink1.equals("Orange Juice") && !drink1.equals("Apple Juice") && !drink1.equals("Wine") && !drink1.equals("Vodka") && !drink1.equals("Nestea") && !drink1.equals("Pepsi") && !drink1.equals("Sprite") && !drink1.equals("Fanta") && !drink1.equals("Coca-Cola") && !drink1.equals("Water") && !drink1.equals("0")) {
                System.out.println("You misspelled the drink, please enter it again");
            }
        }
        // declaring the input variable if the tip is through a percentage
        double tippercentage = 0;
        // declaring the total value variables of tax and tip
        double tipvalue = 0;
        double taxvalue = 0;
        // running an if statement where if the user decides he does not want anymore drinks, I calculate the tax and print out the total
        if (drink1.equals("0")) {
            taxvalue = (13*total)/100;
            total = total + taxvalue;
            System.out.println("At this moment the total with tax is: " + "$" + total );
            // if the people dining here today are less than 10 people i ask how the want to pay the tip. if they would rather through percentage or dollar amount
            if (totalpeople < 10) {
                System.out.println("Type 1 if you would rather choose the tip amount through 'dollar' and type 2 if you would rather choose it through 'percentage'");
                String typetip = string.nextLine();
                if (typetip.equals("2")) {
                    System.out.println("Please enter the percantage ammount you would like to tip(e.g.'15')");
                    tippercentage = input.nextDouble();
                    tipvalue = (tippercentage*total)/100;
                    total = total + tipvalue;
                    System.out.println("The total price will be: " + "$" + total);
                }                
                if (typetip.equals("1")) {
                    System.out.println("Please enter the ammount you would like to tip(e.g.'15')");
                    tipvalue = input.nextDouble();
                    total = total + tipvalue;
                    System.out.println("The total price will be: " + "$" + total);
                }
            }
            // if there is more than 10 people than i give a 20% set amount for the tip, add it to the total and output it
            if (totalpeople > 10){
                System.out.println("due to you having over 10 people we are setting a set value for the tip, that being 20%");
                tippercentage = 20;
                tipvalue = (tippercentage*total)/100;
                total = total + tipvalue;
                System.out.println("The total price will be: " + "$" + total);
            }
        }
        System.out.println("here is the bill");
        System.out.println(numberofadults + " adult(s) will be served " + " = " + "$" + totalPRA);
        System.out.println(numberofchildren + " child(ren) will be served " + " = " + "$" + totalPRC);
        System.out.println(numberoftoddlers + " toddler(s) will be served " + " = " + "$" + totalPRT);

        //declaring a totaldrinks variable and assigning it the value of every drink added
        int totaldrinks = totalvodka + totalwine + totalpepsi + totalsprite + totalwater + totalfanta + totalnestea + totalcocacola + totalapplejuice + totalorangejuice;

        if (totaldrinks > 0) {
            System.out.println("As for the drinks: ");
        }
        if (totalvodka > 0) {
            System.out.println("you ordered " + totalvodka + " glass(es) of vodka" + " = " + "$" + totalvodka*Vodka);
        }
        if (totalwine > 0) {
            System.out.println("you ordered " + totalwine + " glass(es) of wine" + " = " + "$" + totalwine*Wine);
        }
        if (totalpepsi > 0) {
            System.out.println("you ordered " + totalpepsi + " bottle(s) of pepsi" + " = " + "$" + totalpepsi*Pepsi);
        }
        if (totalsprite > 0) {
            System.out.println("you ordered " + totalsprite + " bottle(s) of sprite" + " = " + "$" + totalsprite*Sprite);
        }
        if (totalwater > 0) {
            System.out.println("you ordered " + totalwater + " bottle(s) of wate" + " = " + "$" + totalwater*Water);
        }
        if (totalfanta > 0) {
            System.out.println("you ordered " + totalfanta + " bottle(s) of fanta" + " = " + "$" + totalfanta*Fanta);
        }
        if (totalnestea > 0) {
            System.out.println("you ordered " + totalnestea + " bottle(s) of nestea" + " = " + "$" + totalnestea*Nestea);
        }
        if (totalcocacola > 0) { 
            System.out.println("you ordered " + totalcocacola + " bottle(s) of coca-cola " + " = " + "$" + totalcocacola*CocaCola);
        }
        if (totalapplejuice > 0) {
            System.out.println("you ordered " + totalapplejuice + " glass(es) of apple juice" + " = " + "$" + totalapplejuice*AppleJuice);
        }
        if (totalorangejuice > 0) {   
            System.out.println("you ordered " + totalorangejuice + " glass(es) of orange juice" + " = " + "$" + totalorangejuice*OrangeJuice);
        }
        System.out.println("Total tip = " + "$" + tipvalue); 
        System.out.println("Total taxes = " + "$" + taxvalue);
        System.out.println("So once again the total is: " + "$" + total);
        if (totaldrinks > 0) {
            System.out.println("You drinks will be on their way shortly, have a great day");
        }
        else {
            System.out.println("Your order is finished, have a great day");
        }
    }
}