/**
* Variable Type inference 
*/
class VariableTypeInference{
	public static void main(){
		/* Limited only to Local Variable with initializer */
		var count = 10;
		var nameList = List.of("roger", "tony", "banner", "thor");
		
		/* Local declared in for loop */
		for(var index = 0; index < count; index++){
			System.out.print(index + " ");
		}
		
		System.out.println();
		
		/* Indexes of enhanced for loop or indexes */
		for(var name : nameList){
			System.out.print(name+", ");
		}
	}
}