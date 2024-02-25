	public static boolean isSeq(Queue<Integer> q, int x) {
		boolean flag = false;
		q.insert(null);
		while(q.head() != null) {
			int back = q.remove();
			q.insert(back);	
			if(back == q.head() && back == x) {
				flag = true;
			}
		}
		return flag;
	}
