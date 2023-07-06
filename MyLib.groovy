public class MyLib {
	String message
	Script script

	public MyLib(String message, Script script) {
		this.message = message
		this.script = script
	}
	
	public Say() {
		script.echo("${this.message} develop")
	}
}