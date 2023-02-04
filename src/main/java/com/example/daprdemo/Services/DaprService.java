package com.example.daprdemo.Services;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class DaprService {



    public void saveState(String key, String value){
        try(DaprClient client = (new DaprClientBuilder().build())){
            client.saveState("statestore", key, value).block();
            System.out.println("Value is now: "+ client.getState("statestore", key, String.class).block());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getState(String key){
        try(DaprClient client = (new DaprClientBuilder().build())){
            return client.getState("statestore", key, String.class).block().getValue();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
