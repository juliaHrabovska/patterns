package com.test.singleton;

public class ApOperationsService  {

    private static final String ENDPOINT = String.format("/%s/%s/", "api", "ap-operations-service");
    private static ApOperationsService instance;

    private ApOperationsService() {
    }

    public static ApOperationsService getInstance() {
        if (instance == null) {
            instance = new ApOperationsService();
        }
        return instance;
    }

    protected String getEndpoint() {
        return ENDPOINT;
    }

    public Object /*Response*/ getRequest(String uri) {
        return null;
        /*return logPerformance(uri, "GET", () -> smartPeek(specification.get()
                .header("Content-Type", "application/json")
                .expect().statusCode(HttpStatus.SC_OK).log().ifError()
                .when().get(uri)));*/
    }

    public Object getRequest(String uri, Long id) {
        return null;
    }

    public Object postRequest(String uri, Object body) {
        return null;
    }

    public Object deleteRequest(String uri, Long id) {
        return null;
    }

    public Object putRequest(String uri, Long id, Object body) {
        return null;
    }
}
