package com.example.JUnitDemo;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
public class MyServiceVTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Creating mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Injecting mock into service and call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verifying that getData() was called
        verify(mockApi).getData();
    }
}
