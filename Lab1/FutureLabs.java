public class FutureLabs {
    public static void main(String[] args){
        if(args.length > 0){
            switch(args[0].toLowerCase()){
                case "1":
                    System.out.println("Wed, September 27, 2022");
                    break;
                case "2":
                    System.out.println("Wed, October 26, 2022");
                    break;
                case "3":
                    System.out.println("Wed, November 23, 2022");
                    break;
                case "4":
                    System.out.println("Wed, December 7, 2022");
                    break;
                case "final":
                    System.out.println("Mon, December 19, 2022 1-3pm");
                    break;
                default:
                    System.out.println("Choose between 1-4");
                    break;
            }
        }else{
            System.out.println("Please choose the lab # to print out");
        }
        System.out.println("end");
    }
}