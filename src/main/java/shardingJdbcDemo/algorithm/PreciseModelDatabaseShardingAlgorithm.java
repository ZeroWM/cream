package shardingJdbcDemo.algorithm;/**
 * Created by wm on 2018/12/23.
 */

import io.shardingsphere.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @program: cream
 * @description: 分库算法
 * @author: WangMei
 * @create: 2018-12-23 22:17
 **/
public class PreciseModelDatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Long> shardingValue) {
        for (String each : availableTargetNames) {
            if (each.endsWith((shardingValue.getValue()) % 2 + "")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
