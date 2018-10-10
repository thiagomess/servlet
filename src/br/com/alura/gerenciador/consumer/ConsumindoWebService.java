package br.com.alura.gerenciador.consumer;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;


/*Documentação
 http://hc.apache.org/httpcomponents-client-4.5.x/index.html
 * 
 * fluent-hc-4.5.6
 * commons-logging-1.2
 * httpclient-4.5.6
 * httpcore-4.4.10
 * 
*/
public class ConsumindoWebService {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		String retorno = Request
                .Post("http://localhost:8080/gerenciador/empresas")
                .addHeader("accept", "application/json")
                .bodyString("{'api-key':'a12bc8e423'}", ContentType.APPLICATION_JSON)
                .execute()
                .returnContent()
                .asString();

        System.out.println(retorno);        
	}

}
