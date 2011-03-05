package demo00;

import org.restlet.Server;
import org.restlet.data.Protocol;

public class HelloServer {

	private Server server;

	public HelloServer() throws Exception {
		server = new Server(Protocol.HTTP, 8111, HelloServerResource.class);
	}

	public void start() throws Exception {
		server.start();
	}

	public void stop() throws Exception {
		server.stop();
	}
}
