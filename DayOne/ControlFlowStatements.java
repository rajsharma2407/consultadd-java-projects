class ControlFlowStatements{
    public static void main(String args[]){
        if(true == true){
            System.out.println("If");
        }else{
            System.out.println("Else");
        }
        for(int i=0; i<4; i++){
            if(i == 0){
                continue;
            }
            System.out.println("For "+i);
            if(i ==1) break;
        }
        int i=3;
        while(i > 0){
            System.out.println("While "+i--);
        }
        do{
            System.out.println("Do while "+i);
        }while(i-- > 0);

    }
}  