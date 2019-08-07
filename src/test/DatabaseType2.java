package test;

import static test.DatabaseType2.RDBMS.MYSQL;

public interface DatabaseType2 {

    public boolean detect(String ip, int port);

    enum RDBMS implements DatabaseType2 {
        MYSQL {
            @Override
            public boolean detect(String ip, int port) {
                return false;
            }
        },
        ORACLE {
            @Override
            public boolean detect(String ip, int port) {
                return false;
            }
        },
        SQLSERVER {
            @Override
            public boolean detect(String ip, int port) {
                return false;
            }
        }
    }

    enum NOSQL implements DatabaseType2 {
        REDIS {
            @Override
            public boolean detect(String ip, int port) {
                return false;
            }
        },
        HBASE {
            @Override
            public boolean detect(String ip, int port) {
                return false;
            }
        },
        MONGODB {
            @Override
            public boolean detect(String ip, int port) {
                return false;
            }
        }
    }
     public static void main(String[] args) {
        System.out.println(MYSQL.detect("127.0.0.1", 3306));

    }

}

