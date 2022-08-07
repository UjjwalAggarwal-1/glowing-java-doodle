class occurence{
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int index, char ele){
        
        if(index==str.length()){
            System.out.println("first occurence at "+first);
            System.out.println("last occurence at "+last);
            return;
        }

        char currChar = str.charAt(index);
        if(currChar==ele){
            if(first==-1){
                first=index;
            }else{
                last = index;
            }
        }
        findOccurence(str, index+1, ele);
    }
    public static void main(String [] args){
        String str = "aaghasd";
        findOccurence(str, 0, 'a');
    }
}