package org.datax.console.ds.entity;

import lombok.Data;
import org.datax.console.entity.BaseEntity;

import javax.validation.constraints.NotNull;

/**
 * 数据源实体类
 * @author ChengJie
 * @desciption
 * @date 2019/5/6 20:08
 **/
@Data
public class DataXDs  extends BaseEntity {

    /**
     * 主键Id
     */
    private Long id;

    /**
     * 数据源名称
     */
    private String dsName;

    /**
     * 数据源key值
     */
    private String dsKey;

    /**
     * 监控点
     */
    private Long checkPointId;

    /**
     * 配置内容
     */
    private String configContent;

    /**
     * 数据源状态：0-正常；1-拥堵；2-异常；-1 -禁用
     */
    private Integer status;

    /**
     * 数据源类型：0-MYSQL, 1-ORACLE, 2-ES, 3-HIVE, 4-PRESTO,5-RABBITMQ，6-KAFKA，7-Hbase;
     */
    private Integer type;

    /**
     * 所属机房区域：1-科兴,2-AWS,3-softlayer
     */
    @NotNull(message = "机房不能为空")
    private Integer zone;

}
