public class HonorMath {
    public static int getRequestedNumber(String[] userInputs){
        int i = 0;
        int[] requestedNumbers = {};
        int rNIndex = 0;

        for (String input : userInputs) {
            if(input.isBlank() || input.isEmpty()){
                requestedNumbers[rNIndex] = i;
                rNIndex += 1;
                i += 1;
            }
        }

        if(requestedNumbers.length < 0){
            return(requestedNumbers[0]);
        }

        requestedNumbers[0] = 101;
        return(requestedNumbers[0]); //If requestedNumber is 101, no textfield were empty
    }

    public static String calc(String[] userInputs){

        return("");
    }
}