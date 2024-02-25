	public static boolean isSeq(Queue<Integer> q, int x) {
		boolean flag = false;
		int back = q.remove();
		q.insert(back);
		
		q.insert(null);
		while(q.head() != null) {
			if(back == q.head() && back == x) {
				flag = true;
			}
			
			back = q.remove();
			q.insert(back);
				
		}
		
		return flag;
	}
