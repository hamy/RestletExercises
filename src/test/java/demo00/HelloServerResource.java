package demo00;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloServerResource extends ServerResource {

	@Get public String toString() {
		return "Hello, world!";
	}
}
