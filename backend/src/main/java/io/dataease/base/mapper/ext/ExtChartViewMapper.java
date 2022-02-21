package io.dataease.base.mapper.ext;

import io.dataease.controller.request.chart.ChartViewRequest;
import io.dataease.dto.chart.ChartViewDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExtChartViewMapper {
    List<ChartViewDTO> search(ChartViewRequest request);

    ChartViewDTO searchOne(ChartViewRequest request);

    void chartCopy(@Param("newChartId")String newChartId,@Param("oldChartId")String oldChartId,@Param("panelId")String panelId);

    @Select("select id from chart_view where table_id = #{tableId}")
    List<String> allViewIds(@Param("tableId") String tableId);

    String searchAdviceSceneId(@Param("userId") String userId,@Param("panelId") String panelId);

    int checkSameDataSet(@Param("viewIdSource") String viewIdSource,@Param("viewIdTarget") String viewIdTarget);

    ChartViewDTO searchOneWithPrivileges(@Param("userId") String userId,@Param("id") String id );

    List<ChartViewDTO> searchViewsWithPanelId(@Param("panelId") String panelId);
}
