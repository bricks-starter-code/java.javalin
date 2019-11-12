package test.test;

import io.javalin.Javalin;

public class Main {

	public static void main(String[] args) {
		Javalin app = Javalin.create().start(7000);
        app.get("/route/:variable", ctx ->{
        	String names = ctx.pathParam("variable");
        	String[] splits = names.split(",");
        	for(int i = 0; i < splits.length; i++) {
        		splits[i] = splits[i].toLowerCase();
        	}
        	String result = "";
        	for(int i = 0; i < splits.length; i++) {
        		result += splits[i] + ",";
        	}
        	
        	ctx.result(result);
        });

	}

}
