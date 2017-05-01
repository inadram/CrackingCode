package KnowledgeBase.Four;

import java.util.ArrayList;

public class Generics {
	public void some_generics() {
		ArrayList generic_arrayList = new ArrayList();
		generic_arrayList.add("some string");
		String value = (String) generic_arrayList.get(0);

		ArrayList<String> string_arrayList = new ArrayList<String>();
		string_arrayList.add("some string");
		String str_value = string_arrayList.get(0);

	}
}
