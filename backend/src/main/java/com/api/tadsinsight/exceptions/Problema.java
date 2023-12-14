package com.api.tadsinsight.exceptions;

public class Problema {
	
	private Integer status;
	private String type;
	private String title;
	private String detail;
		
	private Problema () {
		
	}

	public Integer getStatus() {
		return status;
	}

	public String getType() {
		return type;
	}

	public String getTitle() {
		return title;
	}

	public String getDetail() {
		return detail;
	}

	public static ProblemaBuilder builder() {
		return new ProblemaBuilder();
	}
	
	public static class ProblemaBuilder{
		private final Problema problema;
		
		private ProblemaBuilder() {
			this.problema = new Problema();
		}
		
		public ProblemaBuilder status (Integer status) {
			this.problema.status = status;
			return this;
		}
		
		public ProblemaBuilder type(String type) {
            this.problema.type = type;
            return this;
        }

        public ProblemaBuilder title(String title) {
            this.problema.title = title;
            return this;
        }

        public ProblemaBuilder detail(String detail) {
            this.problema.detail = detail;
            return this;
        }

        public Problema build() {
        	return this.problema;
        }
	}

}
