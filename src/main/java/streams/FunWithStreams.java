package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunWithStreams {


    public static void funWithStreams(){


List<Integer> intes = Arrays.asList(1,2,-4,0,2,0,-1,14,0,-1);

//filter out all the zeros

List<Integer> noZero = intes.stream().filter(s -> s != 0).collect(Collectors.toList());

for(Integer element : noZero){
    System.out.println(element);
}

noZero = intes.stream().filter(s -> s != 0).distinct().skip(1).limit(2).sorted() .collect(Collectors.toList());
System.out.println(" The new list : \n");
for(Integer element : noZero){
    System.out.println(element);
}




    }  
    
    
    public static void main(String[] args){

        System.out.println("Starting the processing .... \n");
        FunWithStreams.funWithStreams();

    }
}
