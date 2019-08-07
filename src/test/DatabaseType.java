package test;

public enum DatabaseType {
    /**
     * 封装
     */
//    MYSQL("MySQL数据库"),
//    ORACLE("Oracle数据库"),
//    SQLSERVER("SQL Server数据库");
//
//    private final String name;
//
//    DatabaseType(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public static void main(String[] args) {
//        System.out.println(MYSQL.getName());
//    }
//    MYSQL("1","MySQL数据库"),
//    ORACLE("2","Oracle数据库"),
//    SQLSERVER("3","SQL Server数据库");
//
//    private final String name;
//    private final String code;
//
//    DatabaseType(String code,String name) {
//        this.code = code;
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCode() {
//        return code;
//    }

    /**
     * 多态
     */

//    MYSQL {
//        @Override
//        public boolean detect(String ip, int port) {
//            //为了简化举例环境，此处不真正实现功能
//            return false;
//        }
//    },
//    ORACLE {
//        @Override
//        public boolean detect(String ip, int port) {
//            return false;
//        }
//    },
//    SQLSERVER {
//        @Override
//        public boolean detect(String ip, int port) {
//            return false;
//        }
//    };
//
//    public abstract boolean detect(String ip,int port);
//    public static void main(String[] args) {
//        System.out.println(MYSQL.detect("127.0.0.1", 3306));
//
//    }


}
