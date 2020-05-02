public int search(int list[], int x){
	for(int i = 0; i < list.length; i++){
			if (x == list[i]){
				return i;
			}
	}
	return -1;
}