package cn.itcast.service.impl;

/**
 * Created by Gavin.Stevenson on 2016/12/20.
 * create the table in mysql;
 */
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExportDB {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SchemaExport export = new SchemaExport(cfg);
        export.create(true,true);
    }
}
