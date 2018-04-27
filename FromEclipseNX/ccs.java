	//Setting up properties 
		private Hashtable<String,String>       Props = new Hashtable<String,String>();
		
		public void setprop(String property, String obj) {
			Props.put(property, obj);			
		}
		
		public Hashtable<String,String> getProps() {
			return this.Props;			
		}
			
		//Pas touche		
		StructuredSet 		 lola= new StructuredSet();
		LinkedList<String>   msgFieldList = new LinkedList<String>();
		for( String field : txnData.msgFieldList) {
    
    }
    
    //Pas touche
    
    ///
    	String[] enrichedFields  = ..... 
      	
      for (String XPfield : enrichedFields ) { 
      
      
      }
      ....
      
   // Conversion functions   
   private Object convertField(String init, StructuredSet repla) {
		
		Map<String,Function<String,Object>> typesMap = new HashMap<>();

		//
		Function<String,Object> getByte = arg0 -> {
			try {
				return repla.getByte(arg0);
			} catch (FieldLookupException e3) {
				return "FailedToConvert";
			}
		};
		typesMap.put("b",getByte);
		
		//
		Function<String,Object> getInt = arg0 -> {
			try {
				return repla.getInt(arg0);
			} catch (FieldLookupException e2) {
				return "FailedToConvert";
			}
			
		};
		typesMap.put("i32", getInt);
		
		//
		Function<String,Object> getString = arg0 -> {
			try {
				return repla.getString(arg0);
			} catch (FieldLookupException e1) {
				return "FailedToConvert";
			}
		};
		typesMap.put("s",getString);
		
		///
		Function<String,Object> getDouble =  arg0 -> {
			try {
				return repla.getDouble(arg0);
			} catch (FieldLookupException e) {
				return "FailedToConvert";
			}
		};
		typesMap.put("f64", getDouble);
				
		return typesMap.get(init.substring(init.lastIndexOf('.'), init.length()-1));
