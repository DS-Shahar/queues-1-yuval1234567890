	public static boolean isSeq(Queue<Integer> q, int x) {
		boolean flag = false;
		q.insert(null);
		Integer back = q.head();
		while(q.head() != null) {
			if(back == q.head() && back == x) {
				flag = true;
			}
			back = q.remove();
			q.insert(back);	
		}
		return flag;
	}
