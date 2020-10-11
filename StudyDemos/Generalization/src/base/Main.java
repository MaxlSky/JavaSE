package base;

public class Main {

    public static void main(String[] args) {
		Insurance o1 = new Insurance("БелСтрах", 20, 1994,7.5, "+375298978602");
		Insurance o2 = new Insurance("ГосСтрах", 22, 2001,5.5);
		Insurance o3 = new Insurance("СтрахованиеЖизни", 5, 2015,2.5);

		Set mySet = new Set();
		//System.out.println("Размер массива mySet: " + mySet.getSize());
		mySet.add(2); // 2
		mySet.add(3); // 3
		mySet.add(5);
		mySet.add(6);

		Set someSet = new Set();
		someSet.add(3); // 3
		someSet.add(5); // 5
		someSet.add(8);
		someSet.add(1);

		System.out.println("Первое множество: " + mySet);
		System.out.println("Второе множество: " + someSet);
		System.out.println("Разность множеств: " + justDifference(mySet,someSet));
		System.out.println("Первое множество: " + mySet);
		System.out.println("Второе множество: " + someSet);
		System.out.println("Симметричная разность множеств: " + symDifference(mySet,someSet));
		System.out.println("Объединение множеств: " + Union(mySet,someSet));
		System.out.println("Пересечение множеств: " + Intersection(mySet,someSet));
    }

    public static Set justDifference(Set a, Set b){
    	Set newClone = new Set();
		newClone.clone(a);
		newClone.removeAll(b);
    	return newClone;
	}

	public static Set symDifference(Set a, Set b){
		Set newClone = new Set();
		newClone.clone(a);
		newClone.removeAll(b);
		Set newClone2 = new Set();
		newClone2.clone(b);
		newClone2.removeAll(a);
		newClone.concat(newClone2);
		return newClone;
	}

	public static Set Intersection(Set a, Set b){
		Set newCloneConcat1 = new Set();
		newCloneConcat1.clone(a);
		Set newCloneConcat2 = new Set();
		newCloneConcat1.clone(b);
		newCloneConcat1.concat(newCloneConcat2);
		Set newClone = new Set();
		newClone.clone(a);
		newClone.removeAll(b);
		Set newClone2 = new Set();
		newClone2.clone(b);
		newClone2.removeAll(a);
		newCloneConcat1.removeAll(newClone);
		newCloneConcat1.removeAll(newClone2);
		return newCloneConcat1;
	}

	public static Set Union(Set a, Set b){
		Set newClone = new Set();
		newClone.clone(a);
		Set newClone2 = new Set();
		newClone2.clone(b);
		newClone.concat(newClone2);
		return newClone;
	}

}
