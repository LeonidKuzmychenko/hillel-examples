package lk.tech.twentyfoure.singleton;

public enum DataBaseEnumService {

    INSTANCE(new DataBaseService());

    private DataBaseService dataBaseService;

    DataBaseEnumService(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public DataBaseService getDataBaseService() {
        return dataBaseService;
    }
}
