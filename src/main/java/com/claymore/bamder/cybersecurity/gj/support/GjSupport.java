package com.claymore.bamder.cybersecurity.gj.support;

import com.claymore.bamder.common.util.PercentUtil;
import com.claymore.bamder.cybersecurity.gj.domain.district.GjCityResponse;
import com.claymore.bamder.cybersecurity.gj.domain.district.GjDistrictResponse;
import com.claymore.bamder.cybersecurity.gj.domain.gj.response.*;
import com.claymore.bamder.cybersecurity.gj.entity.ChuzhiGjqmEntity;
import com.claymore.bamder.cybersecurity.gj.entity.ChuzhiMbsjEntity;
import com.claymore.bamder.cybersecurity.gj.entity.ChuzhiTxzdEntity;
import com.claymore.bamder.cybersecurity.gj.entity.ChuzhiWgxwEntity;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author li.zhuo
 * @create 2018/11/25 9:18 PM
 * @since 1.0.0
 */
public class GjSupport {

    public static GjzlResponse transfer2GjzlResponse(List<ChuzhiWgxwEntity> wgxwEntities, List<ChuzhiGjqmEntity> gjqmEntities, List<ChuzhiTxzdEntity> txzdEntities, List<ChuzhiMbsjEntity> mbsjEntities) {
        GjzlResponse gjzlResponse = new GjzlResponse();

        Long wgxwTotal = wgxwEntities.stream().map(chuzhiWgxwEntity -> chuzhiWgxwEntity.getWgxw1() + chuzhiWgxwEntity.getWgxw2() + chuzhiWgxwEntity.getWgxw3() + chuzhiWgxwEntity.getWgxw4() + chuzhiWgxwEntity.getWgxw5()).reduce(0L, Long::sum);
        Long gjqmTotal = gjqmEntities.stream().map(chuzhiGjqmEntity -> chuzhiGjqmEntity.getGjqm1() + chuzhiGjqmEntity.getGjqm2() + chuzhiGjqmEntity.getGjqm3() + chuzhiGjqmEntity.getGjqm4() + chuzhiGjqmEntity.getGjqm5()).reduce(0L, Long::sum);
        Long txzdTotal = txzdEntities.stream().map(chuzhiTxzdEntity -> chuzhiTxzdEntity.getTxzd1() + chuzhiTxzdEntity.getTxzd2() + chuzhiTxzdEntity.getTxzd3() + chuzhiTxzdEntity.getTxzd4() + chuzhiTxzdEntity.getTxzd5()).reduce(0L, Long::sum);
        Long mbsjTotal = mbsjEntities.stream().map(chuzhiMbsjEntity -> chuzhiMbsjEntity.getMbsj1() + chuzhiMbsjEntity.getMbsj2() + chuzhiMbsjEntity.getMbsj3() + chuzhiMbsjEntity.getMbsj4() + chuzhiMbsjEntity.getMbsj5()).reduce(0L, Long::sum);
        Long total = wgxwTotal + gjqmTotal + txzdTotal + mbsjTotal;

        gjzlResponse.setGjqmNumber(gjqmTotal);
        gjzlResponse.setGjqmPercent(PercentUtil.longDivideFormat(wgxwTotal, total));
        gjzlResponse.setMbsjNumber(mbsjTotal);
        gjzlResponse.setMbsjPercent(PercentUtil.longDivideFormat(mbsjTotal, total));
        gjzlResponse.setTxzdNumber(txzdTotal);
        gjzlResponse.setTxzdPercent(PercentUtil.longDivideFormat(txzdTotal, total));
        gjzlResponse.setWgxwNumber(wgxwTotal);
        gjzlResponse.setWgxwPercent(PercentUtil.longDivideFormat(mbsjTotal, total));
        gjzlResponse.setTotalNumber(total);

        return gjzlResponse;
    }

    public static GjjbfbResponse transfer2GjjbfbResponse(List<ChuzhiWgxwEntity> wgxwEntities, List<ChuzhiGjqmEntity> gjqmEntities, List<ChuzhiTxzdEntity> txzdEntities, List<ChuzhiMbsjEntity> mbsjEntities) {
        GjjbfbResponse response = new GjjbfbResponse();
        Long wgxw1 = wgxwEntities.stream().map(ChuzhiWgxwEntity::getWgxw1).reduce(0L, Long::sum);
        Long wgxw2 = wgxwEntities.stream().map(ChuzhiWgxwEntity::getWgxw2).reduce(0L, Long::sum);
        Long wgxw3 = wgxwEntities.stream().map(ChuzhiWgxwEntity::getWgxw3).reduce(0L, Long::sum);
        Long wgxw4 = wgxwEntities.stream().map(ChuzhiWgxwEntity::getWgxw4).reduce(0L, Long::sum);
        Long wgxw5 = wgxwEntities.stream().map(ChuzhiWgxwEntity::getWgxw5).reduce(0L, Long::sum);

        Long gjqm1 = gjqmEntities.stream().map(ChuzhiGjqmEntity::getGjqm1).reduce(0L, Long::sum);
        Long gjqm2 = gjqmEntities.stream().map(ChuzhiGjqmEntity::getGjqm2).reduce(0L, Long::sum);
        Long gjqm3 = gjqmEntities.stream().map(ChuzhiGjqmEntity::getGjqm3).reduce(0L, Long::sum);
        Long gjqm4 = gjqmEntities.stream().map(ChuzhiGjqmEntity::getGjqm4).reduce(0L, Long::sum);
        Long gjqm5 = gjqmEntities.stream().map(ChuzhiGjqmEntity::getGjqm5).reduce(0L, Long::sum);

        Long txzd1 = txzdEntities.stream().map(ChuzhiTxzdEntity::getTxzd1).reduce(0L, Long::sum);
        Long txzd2 = txzdEntities.stream().map(ChuzhiTxzdEntity::getTxzd2).reduce(0L, Long::sum);
        Long txzd3 = txzdEntities.stream().map(ChuzhiTxzdEntity::getTxzd3).reduce(0L, Long::sum);
        Long txzd4 = txzdEntities.stream().map(ChuzhiTxzdEntity::getTxzd4).reduce(0L, Long::sum);
        Long txzd5 = txzdEntities.stream().map(ChuzhiTxzdEntity::getTxzd5).reduce(0L, Long::sum);

        Long mbsj1 = mbsjEntities.stream().map(ChuzhiMbsjEntity::getMbsj1).reduce(0L, Long::sum);
        Long mbsj2 = mbsjEntities.stream().map(ChuzhiMbsjEntity::getMbsj2).reduce(0L, Long::sum);
        Long mbsj3 = mbsjEntities.stream().map(ChuzhiMbsjEntity::getMbsj3).reduce(0L, Long::sum);
        Long mbsj4 = mbsjEntities.stream().map(ChuzhiMbsjEntity::getMbsj4).reduce(0L, Long::sum);
        Long mbsj5 = mbsjEntities.stream().map(ChuzhiMbsjEntity::getMbsj5).reduce(0L, Long::sum);

        response.setWgxw1(wgxw1);
        response.setWgxw2(wgxw2);
        response.setWgxw3(wgxw3);
        response.setWgxw4(wgxw4);
        response.setWgxw5(wgxw5);

        response.setGjqm1(gjqm1);
        response.setGjqm2(gjqm2);
        response.setGjqm3(gjqm3);
        response.setGjqm4(gjqm4);
        response.setGjqm5(gjqm5);

        response.setTxzd1(txzd1);
        response.setTxzd2(txzd2);
        response.setTxzd3(txzd3);
        response.setTxzd4(txzd4);
        response.setTxzd5(txzd5);

        response.setMbsj1(mbsj1);
        response.setMbsj2(mbsj2);
        response.setMbsj3(mbsj3);
        response.setMbsj4(mbsj4);
        response.setMbsj5(mbsj5);

        return response;
    }

    public static GjczlResponse transfer2GjczlResponse(List<ChuzhiWgxwEntity> wgxwEntities, List<ChuzhiGjqmEntity> gjqmEntities, List<ChuzhiTxzdEntity> txzdEntities, List<ChuzhiMbsjEntity> mbsjEntities, GjzlResponse gjzlResponse) {
        GjczlResponse response = new GjczlResponse();

        Long fgjqmNumber = gjqmEntities.stream().map(entity -> entity.getGjqm1D0() + entity.getGjqm2D0() + entity.getGjqm3D0() + entity.getGjqm4D0() + entity.getGjqm5D()).reduce(0L, Long::sum);
        Long fsmnrNumber = wgxwEntities.stream().map(entity -> entity.getWgxw1D0() + entity.getWgxw2D0() + entity.getWgxw3D0() + entity.getWgxw4D0() + entity.getWgxw5D0()).reduce(0L, Long::sum);
        /*Long gjqmNumber = gjqmEntities.stream().map(entity -> entity.getGjqm1D1() + entity.getGjqm1D2() + entity.getGjqm1D3() +
                entity.getGjqm2D1() + entity.getGjqm2D2() + entity.getGjqm2D3() +
                entity.getGjqm3D1() + entity.getGjqm3D2() + entity.getGjqm3D3() +
                entity.getGjqm4D1() + entity.getGjqm4D2() + entity.getGjqm4D3() +
                entity.getGjqm5D1() + entity.getGjqm5D2() + entity.getGjqm5D3()).reduce(0L, Long::sum);*/

        Long gjqmNumberMimi = gjqmEntities.stream().map(entity -> entity.getGjqm1D1() + entity.getGjqm2D1() + entity.getGjqm3D1() + entity.getGjqm4D1() + entity.getGjqm5D1() ).reduce(0L, Long::sum);
        Long gjqmNumberJimi = gjqmEntities.stream().map(entity -> entity.getGjqm1D2() + entity.getGjqm2D2() + entity.getGjqm3D2() + entity.getGjqm4D2() + entity.getGjqm5D2() ).reduce(0L, Long::sum);
        Long gjqmNumberJuemi = gjqmEntities.stream().map(entity -> entity.getGjqm1D3() + entity.getGjqm2D3() + entity.getGjqm3D3() + entity.getGjqm4D3() + entity.getGjqm5D3() ).reduce(0L, Long::sum);

        /*Long smnrNumber = wgxwEntities.stream().map(entity -> entity.getWgxw1D1() + entity.getWgxw1D2() + entity.getWgxw1D3() +
                entity.getWgxw2D1() + entity.getWgxw2D2() + entity.getWgxw2D3() +
                entity.getWgxw3D1() + entity.getWgxw3D2() + entity.getWgxw3D3() +
                entity.getWgxw4D1() + entity.getWgxw4D2() + entity.getWgxw4D3() ++ entity.getWgxw1D2() + entity.getWgxw1D3() +
                entity.getWgxw5D1() + entity.getWgxw5D2() + entity.getWgxw5D3()).reduce(0L, Long::sum);*/

        Long smnrNumberMimi = wgxwEntities.stream().map(entity -> entity.getWgxw1D1() + entity.getWgxw2D1() + entity.getWgxw3D1() + entity.getWgxw4D1() + entity.getWgxw5D1() ).reduce(0L, Long::sum);
        Long smnrNumberJimi = wgxwEntities.stream().map(entity -> entity.getWgxw1D2() + entity.getWgxw2D2() + entity.getWgxw3D2() + entity.getWgxw4D2() + entity.getWgxw5D2() ).reduce(0L, Long::sum);
        Long smnrNumberJuemi = wgxwEntities.stream().map(entity -> entity.getWgxw1D3() + entity.getWgxw2D3() + entity.getWgxw3D3() + entity.getWgxw4D3() + entity.getWgxw5D3() ).reduce(0L, Long::sum);

        Long wgxwTotal = gjzlResponse.getWgxwNumber();
        Long gjqmTotal = gjzlResponse.getGjqmNumber();
        Long mbsjTotal = gjzlResponse.getMbsjNumber();
        Long txzdTotal = gjzlResponse.getTotalNumber();

        Long wgxwCz = wgxwEntities.stream().map(chuzhiWgxwEntity -> chuzhiWgxwEntity.getWgxw1D() + chuzhiWgxwEntity.getWgxw2D() + chuzhiWgxwEntity.getWgxw3D() + chuzhiWgxwEntity.getWgxw4D() + chuzhiWgxwEntity.getWgxw5D()).reduce(0L, Long::sum);
        Long gjqmCz = gjqmEntities.stream().map(chuzhiGjqmEntity -> chuzhiGjqmEntity.getGjqm1D() + chuzhiGjqmEntity.getGjqm2D() + chuzhiGjqmEntity.getGjqm3D() + chuzhiGjqmEntity.getGjqm4D() + chuzhiGjqmEntity.getGjqm5D()).reduce(0L, Long::sum);
        Long mbsjCz = mbsjEntities.stream().map(chuzhiMbsjEntity -> chuzhiMbsjEntity.getMbsj1D() + chuzhiMbsjEntity.getMbsj2D() + chuzhiMbsjEntity.getMbsj3D() + chuzhiMbsjEntity.getMbsj4D() + chuzhiMbsjEntity.getMbsj5D()).reduce(0L, Long::sum);
        Long txzdCz = txzdEntities.stream().map(chuzhiTxzdEntity -> chuzhiTxzdEntity.getTxzd1D() + chuzhiTxzdEntity.getTxzd2D() + chuzhiTxzdEntity.getTxzd3D() + chuzhiTxzdEntity.getTxzd4D() + chuzhiTxzdEntity.getTxzd5D()).reduce(0L, Long::sum);


        //String gjczlPercent = PercentUtil.format((wgxwCz + gjqmCz + mbsjCz + txzdCz) / (wgxwTotal + gjqmTotal + mbsjTotal + txzdTotal));
        String gjczlPercent = PercentUtil.longDivideFormat(wgxwCz + gjqmCz + mbsjCz + txzdCz, wgxwTotal + gjqmTotal + mbsjTotal + txzdTotal);

        response.setFgjqmNumber(fgjqmNumber);
        response.setFsmnrNumber(fsmnrNumber);
        response.setNormalTotal(fgjqmNumber + fsmnrNumber);
        response.setGjqmNumberJimi(gjqmNumberJimi);
        response.setGjqmNumberMimi(gjqmNumberMimi);
        response.setGjqmNumberJuemi(gjqmNumberJuemi);
        response.setSmnrNumberMimi(smnrNumberMimi);
        response.setSmnrNumberJimi(smnrNumberJimi);
        response.setSmnrNumberJuemi(smnrNumberJuemi);
        response.setExceptionNumber(gjqmNumberJimi + gjqmNumberMimi + gjqmNumberJuemi + smnrNumberMimi + smnrNumberJimi + smnrNumberJuemi);
        //response.setGjqmNumber(gjqmNumber);
        //response.setSmnrNumber(smnrNumber);
        response.setGjczlPercent(gjczlPercent);

        /*response.setGjqmCz(gjqmCz);
        response.setGjqmTotal(gjqmTotal);
        response.setWgxwCz(wgxwCz);
        response.setWgxwTotal(wgxwTotal);
        response.setMbsjCz(mbsjCz);
        response.setMbsjTotal(mbsjTotal);
        response.setTxzdCz(txzdCz);
        response.setTxzdTotal(txzdTotal);*/

        return response;
    }

    public static SjgjczListResponse transfer2SjgjczListResponse(List<ChuzhiWgxwEntity> wgxwEntities, List<ChuzhiGjqmEntity> gjqmEntities, List<ChuzhiTxzdEntity> txzdEntities, List<ChuzhiMbsjEntity> mbsjEntities) {
        SjgjczListResponse response = new SjgjczListResponse();
        List<SjgjzcResponse> collectWgxw = wgxwEntities.stream().map(GjSupport::transfer2SjgjzcResponse).collect(Collectors.toList());
        List<SjgjzcResponse> collectGJqm = gjqmEntities.stream().map(GjSupport::transfer2SjgjzcResponse).collect(Collectors.toList());
        List<SjgjzcResponse> collectTxzd = txzdEntities.stream().map(GjSupport::transfer2SjgjzcResponse).collect(Collectors.toList());
        List<SjgjzcResponse> collectMbsj = mbsjEntities.stream().map(GjSupport::transfer2SjgjzcResponse).collect(Collectors.toList());
        List<SjgjzcResponse> responsesList = Lists.newArrayList();
        responsesList.addAll(collectWgxw);
        responsesList.addAll(collectGJqm);
        responsesList.addAll(collectTxzd);
        responsesList.addAll(collectMbsj);
        List<SjgjzcResponse> collect = responsesList.stream().collect(Collectors.groupingBy(SjgjzcResponse::getSj, Collectors.reducing((x, y) -> {
            x.setCzNumber(x.getCzNumber() + y.getCzNumber());
            return x;
        }))).entrySet().stream().filter(dateOptionalEntry -> dateOptionalEntry.getValue().isPresent()).map(dateOptionalEntry -> dateOptionalEntry.getValue().get()).collect(Collectors.toList());
        response.setSjgjzcResponses(collect);
        return response;
    }

    public static SjgjzcResponse transfer2SjgjzcResponse(ChuzhiWgxwEntity entity) {
        SjgjzcResponse response = new SjgjzcResponse();
        response.setSj(entity.getDay());
        response.setCzNumber(entity.getWgxw1D() + entity.getWgxw2D() + entity.getWgxw3D() + entity.getWgxw4D() + entity.getWgxw5D());
        return response;
    }

    public static SjgjzcResponse transfer2SjgjzcResponse(ChuzhiGjqmEntity entity) {
        SjgjzcResponse response = new SjgjzcResponse();
        response.setSj(entity.getDay());
        response.setCzNumber(entity.getGjqm1D() + entity.getGjqm2D() + entity.getGjqm3D() + entity.getGjqm4D() + entity.getGjqm5D());
        return response;
    }

    public static SjgjzcResponse transfer2SjgjzcResponse(ChuzhiTxzdEntity entity) {
        SjgjzcResponse response = new SjgjzcResponse();
        response.setSj(entity.getDay());
        response.setCzNumber(entity.getTxzd1D() + entity.getTxzd2D() + entity.getTxzd3D() + entity.getTxzd4D() + entity.getTxzd5D());
        return response;
    }

    public static SjgjzcResponse transfer2SjgjzcResponse(ChuzhiMbsjEntity entity) {
        SjgjzcResponse response = new SjgjzcResponse();
        response.setSj(entity.getDay());
        response.setCzNumber(entity.getMbsj1D() + entity.getMbsj2D() + entity.getMbsj3D() + entity.getMbsj4D() + entity.getMbsj5D());
        return response;
    }


    public List<GjDistrictResponse> transfer2DistrictResponse(List<ChuzhiWgxwEntity> wgxwEntities, List<ChuzhiGjqmEntity> gjqmEntities, List<ChuzhiTxzdEntity> txzdEntities, List<ChuzhiMbsjEntity> mbsjEntities) {
        List<GjDistrictResponse> responses = Lists.newArrayList();

        Map<String, List<ChuzhiWgxwEntity>> wgxw = wgxwEntities.stream().collect(Collectors.groupingBy(ChuzhiWgxwEntity::getDistrict));
        Map<String, List<ChuzhiGjqmEntity>> gjqm = gjqmEntities.stream().collect(Collectors.groupingBy(ChuzhiGjqmEntity::getDistrict));
        Map<String, List<ChuzhiTxzdEntity>> txzd = txzdEntities.stream().collect(Collectors.groupingBy(ChuzhiTxzdEntity::getDistrict));
        Map<String, List<ChuzhiMbsjEntity>> mbsj = mbsjEntities.stream().collect(Collectors.groupingBy(ChuzhiMbsjEntity::getDistrict));

        return null;
    }


    /** map city**/
    public static GjCityResponse wgxwMapToCity(String city, List<ChuzhiWgxwEntity> cityWgxws) {
        GjCityResponse response = new GjCityResponse();
        response.setCityId(city);
        response.setWgxwChuzhi(cityWgxws.stream().collect(Collectors.summingLong(e -> e.getWgxw1D() + e.getWgxw2D() + e.getWgxw3D() + e.getWgxw4D() + e.getWgxw5D())));
        response.setWgxwNumber(cityWgxws.stream().collect(Collectors.summingLong(e -> e.getWgxw1() + e.getWgxw2() + e.getWgxw3() + e.getWgxw4() + e.getWgxw5())));
        response.setLevel1(cityWgxws.stream().map(e -> e.getWgxw1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityWgxws.stream().map(e -> e.getWgxw1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityWgxws.stream().map(e -> e.getWgxw2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityWgxws.stream().map(e -> e.getWgxw2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityWgxws.stream().map(e -> e.getWgxw3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityWgxws.stream().map(e -> e.getWgxw3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityWgxws.stream().map(e -> e.getWgxw4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityWgxws.stream().map(e -> e.getWgxw4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityWgxws.stream().map(e -> e.getWgxw5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityWgxws.stream().map(e -> e.getWgxw5D()).reduce(Long::sum).orElse(0L));
        return response;
    }

    public static GjCityResponse gjqmMapToCity(String city, List<ChuzhiGjqmEntity> cityGjqm) {
        GjCityResponse response = new GjCityResponse();
        response.setCityId(city);
        response.setGjqmChuzhi(cityGjqm.stream().collect(Collectors.summingLong(e -> e.getGjqm1D() + e.getGjqm2D() + e.getGjqm3D() + e.getGjqm4D() + e.getGjqm5D())));
        response.setGjqmNumber(cityGjqm.stream().collect(Collectors.summingLong(e -> e.getGjqm1() + e.getGjqm2() + e.getGjqm3() + e.getGjqm4() + e.getGjqm5())));
        response.setLevel1(cityGjqm.stream().map(e -> e.getGjqm1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityGjqm.stream().map(e -> e.getGjqm1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityGjqm.stream().map(e -> e.getGjqm2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityGjqm.stream().map(e -> e.getGjqm2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityGjqm.stream().map(e -> e.getGjqm3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityGjqm.stream().map(e -> e.getGjqm3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityGjqm.stream().map(e -> e.getGjqm4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityGjqm.stream().map(e -> e.getGjqm4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityGjqm.stream().map(e -> e.getGjqm5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityGjqm.stream().map(e -> e.getGjqm5D()).reduce(Long::sum).orElse(0L));
        return response;
    }

    public static GjCityResponse txzdMapToCity(String city, List<ChuzhiTxzdEntity> cityTxzd) {
        GjCityResponse response = new GjCityResponse();
        response.setCityId(city);
        response.setTxzdChuzhi(cityTxzd.stream().collect(Collectors.summingLong(e -> e.getTxzd1D() + e.getTxzd2D() + e.getTxzd3D() + e.getTxzd4D() + e.getTxzd5D())));
        response.setTxzdNumber(cityTxzd.stream().collect(Collectors.summingLong(e -> e.getTxzd1() + e.getTxzd2() + e.getTxzd3() + e.getTxzd4() + e.getTxzd5())));
        response.setLevel1(cityTxzd.stream().map(e -> e.getTxzd1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityTxzd.stream().map(e -> e.getTxzd1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityTxzd.stream().map(e -> e.getTxzd2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityTxzd.stream().map(e -> e.getTxzd2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityTxzd.stream().map(e -> e.getTxzd3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityTxzd.stream().map(e -> e.getTxzd3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityTxzd.stream().map(e -> e.getTxzd4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityTxzd.stream().map(e -> e.getTxzd4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityTxzd.stream().map(e -> e.getTxzd5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityTxzd.stream().map(e -> e.getTxzd5D()).reduce(Long::sum).orElse(0L));
        return response;
    }


    public static GjCityResponse mbsjMapToCity(String city, List<ChuzhiMbsjEntity> cityMbsj) {
        GjCityResponse response = new GjCityResponse();
        response.setCityId(city);

        response.setMbsjChuzhi(cityMbsj.stream().collect(Collectors.summingLong(e -> e.getMbsj1D() + e.getMbsj2D() + e.getMbsj3D() + e.getMbsj4D() + e.getMbsj5D())));
        response.setMbsjNumber(cityMbsj.stream().collect(Collectors.summingLong(e -> e.getMbsj1() + e.getMbsj2() + e.getMbsj3() + e.getMbsj4() + e.getMbsj5())));
        response.setLevel1(cityMbsj.stream().map(e -> e.getMbsj1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityMbsj.stream().map(e -> e.getMbsj1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityMbsj.stream().map(e -> e.getMbsj2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityMbsj.stream().map(e -> e.getMbsj2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityMbsj.stream().map(e -> e.getMbsj3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityMbsj.stream().map(e -> e.getMbsj3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityMbsj.stream().map(e -> e.getMbsj4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityMbsj.stream().map(e -> e.getMbsj4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityMbsj.stream().map(e -> e.getMbsj5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityMbsj.stream().map(e -> e.getMbsj5D()).reduce(Long::sum).orElse(0L));
        return response;
    }

    public static List<GjCityResponse> mergeCity(List<GjCityResponse> cityWgxw, List<GjCityResponse> cityGjqm, List<GjCityResponse> cityTxzd, List<GjCityResponse> cityMbsj) {
        Set<String> allCities = Sets.newHashSet();
        Set<String> collect1 = cityWgxw.stream().map(GjCityResponse::getCityId).collect(Collectors.toSet());
        Set<String> collect2 = cityGjqm.stream().map(GjCityResponse::getCityId).collect(Collectors.toSet());
        Set<String> collect3 = cityTxzd.stream().map(GjCityResponse::getCityId).collect(Collectors.toSet());
        Set<String> collect4 = cityMbsj.stream().map(GjCityResponse::getCityId).collect(Collectors.toSet());
        allCities.addAll(collect1);
        allCities.addAll(collect2);
        allCities.addAll(collect3);
        allCities.addAll(collect4);
        List<GjCityResponse> responseList = Lists.newArrayList();
        allCities.forEach(city -> {
            GjCityResponse response = new GjCityResponse();
            response.setCityId(city);
            Optional<GjCityResponse> anyWgxw = cityWgxw.stream().filter(wgxw -> wgxw.getCityId().equals(city)).findAny();
            if (anyWgxw.isPresent()) {
                response.setWgxwNumber(anyWgxw.get().getWgxwNumber());
                response.setWgxwChuzhi(anyWgxw.get().getWgxwChuzhi());
                response.setLevel1(anyWgxw.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyWgxw.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyWgxw.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyWgxw.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyWgxw.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyWgxw.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyWgxw.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyWgxw.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyWgxw.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyWgxw.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            Optional<GjCityResponse> anyGjqm = cityGjqm.stream().filter(gjqm -> gjqm.getCityId().equals(city)).findAny();
            if (anyGjqm.isPresent()) {
                response.setGjqmNumber(anyGjqm.get().getGjqmNumber());
                response.setGjqmChuzhi(anyGjqm.get().getGjqmChuzhi());
                response.setLevel1(anyGjqm.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyGjqm.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyGjqm.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyGjqm.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyGjqm.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyGjqm.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyGjqm.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyGjqm.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyGjqm.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyGjqm.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            Optional<GjCityResponse> anyTxzd = cityTxzd.stream().filter(gjqm -> gjqm.getCityId().equals(city)).findAny();
            if (anyTxzd.isPresent()) {
                response.setTxzdNumber(anyTxzd.get().getTxzdNumber());
                response.setTxzdChuzhi(anyTxzd.get().getTxzdChuzhi());
                response.setLevel1(anyTxzd.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyTxzd.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyTxzd.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyTxzd.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyTxzd.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyTxzd.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyTxzd.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyTxzd.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyTxzd.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyTxzd.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            Optional<GjCityResponse> anyMbsj = cityMbsj.stream().filter(gjqm -> gjqm.getCityId().equals(city)).findAny();
            if (anyMbsj.isPresent()) {
                response.setMbsjNumber(anyMbsj.get().getMbsjNumber());
                response.setMbsjChuzhi(anyMbsj.get().getMbsjChuzhi());
                response.setLevel1(anyMbsj.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyMbsj.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyMbsj.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyMbsj.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyMbsj.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyMbsj.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyMbsj.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyMbsj.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyMbsj.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyMbsj.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            responseList.add(response);
        });
        return responseList;
    }



    /** map district**/
    public static GjDistrictResponse wgxwMapToDistrict(String district, List<ChuzhiWgxwEntity> cityWgxws) {
        GjDistrictResponse response = new GjDistrictResponse();
        response.setDistrictId(district);
        response.setWgxwChuzhi(cityWgxws.stream().collect(Collectors.summingLong(e -> e.getWgxw1D() + e.getWgxw2D() + e.getWgxw3D() + e.getWgxw4D() + e.getWgxw5D())));
        response.setWgxwNumber(cityWgxws.stream().collect(Collectors.summingLong(e -> e.getWgxw1() + e.getWgxw2() + e.getWgxw3() + e.getWgxw4() + e.getWgxw5())));
        response.setLevel1(cityWgxws.stream().map(e -> e.getWgxw1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityWgxws.stream().map(e -> e.getWgxw1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityWgxws.stream().map(e -> e.getWgxw2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityWgxws.stream().map(e -> e.getWgxw2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityWgxws.stream().map(e -> e.getWgxw3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityWgxws.stream().map(e -> e.getWgxw3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityWgxws.stream().map(e -> e.getWgxw4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityWgxws.stream().map(e -> e.getWgxw4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityWgxws.stream().map(e -> e.getWgxw5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityWgxws.stream().map(e -> e.getWgxw5D()).reduce(Long::sum).orElse(0L));
        return response;
    }

    public static GjDistrictResponse gjqmMapToDistrict(String district, List<ChuzhiGjqmEntity> cityGjqm) {
        GjDistrictResponse response = new GjDistrictResponse();
        response.setDistrictId(district);
        response.setGjqmChuzhi(cityGjqm.stream().collect(Collectors.summingLong(e -> e.getGjqm1D() + e.getGjqm2D() + e.getGjqm3D() + e.getGjqm4D() + e.getGjqm5D())));
        response.setGjqmNumber(cityGjqm.stream().collect(Collectors.summingLong(e -> e.getGjqm1() + e.getGjqm2() + e.getGjqm3() + e.getGjqm4() + e.getGjqm5())));
        response.setLevel1(cityGjqm.stream().map(e -> e.getGjqm1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityGjqm.stream().map(e -> e.getGjqm1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityGjqm.stream().map(e -> e.getGjqm2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityGjqm.stream().map(e -> e.getGjqm2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityGjqm.stream().map(e -> e.getGjqm3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityGjqm.stream().map(e -> e.getGjqm3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityGjqm.stream().map(e -> e.getGjqm4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityGjqm.stream().map(e -> e.getGjqm4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityGjqm.stream().map(e -> e.getGjqm5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityGjqm.stream().map(e -> e.getGjqm5D()).reduce(Long::sum).orElse(0L));
        return response;
    }

    public static GjDistrictResponse txzdMapToDistrict(String district, List<ChuzhiTxzdEntity> cityTxzd) {
        GjDistrictResponse response = new GjDistrictResponse();
        response.setDistrictId(district);
        response.setTxzdChuzhi(cityTxzd.stream().collect(Collectors.summingLong(e -> e.getTxzd1D() + e.getTxzd2D() + e.getTxzd3D() + e.getTxzd4D() + e.getTxzd5D())));
        response.setTxzdNumber(cityTxzd.stream().collect(Collectors.summingLong(e -> e.getTxzd1() + e.getTxzd2() + e.getTxzd3() + e.getTxzd4() + e.getTxzd5())));
        response.setLevel1(cityTxzd.stream().map(e -> e.getTxzd1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityTxzd.stream().map(e -> e.getTxzd1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityTxzd.stream().map(e -> e.getTxzd2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityTxzd.stream().map(e -> e.getTxzd2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityTxzd.stream().map(e -> e.getTxzd3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityTxzd.stream().map(e -> e.getTxzd3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityTxzd.stream().map(e -> e.getTxzd4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityTxzd.stream().map(e -> e.getTxzd4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityTxzd.stream().map(e -> e.getTxzd5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityTxzd.stream().map(e -> e.getTxzd5D()).reduce(Long::sum).orElse(0L));
        return response;
    }


    public static GjDistrictResponse mbsjMapToDistrict(String district, List<ChuzhiMbsjEntity> cityMbsj) {
        GjDistrictResponse response = new GjDistrictResponse();
        response.setDistrictId(district);

        response.setMbsjChuzhi(cityMbsj.stream().collect(Collectors.summingLong(e -> e.getMbsj1D() + e.getMbsj2D() + e.getMbsj3D() + e.getMbsj4D() + e.getMbsj5D())));
        response.setMbsjNumber(cityMbsj.stream().collect(Collectors.summingLong(e -> e.getMbsj1() + e.getMbsj2() + e.getMbsj3() + e.getMbsj4() + e.getMbsj5())));
        response.setLevel1(cityMbsj.stream().map(e -> e.getMbsj1()).reduce(Long::sum).orElse(0L));
        response.setLevel1Chuzhi(cityMbsj.stream().map(e -> e.getMbsj1D()).reduce(Long::sum).orElse(0L));

        response.setLevel2(cityMbsj.stream().map(e -> e.getMbsj2()).reduce(Long::sum).orElse(0L));
        response.setLevel2Chuzhi(cityMbsj.stream().map(e -> e.getMbsj2D()).reduce(Long::sum).orElse(0L));

        response.setLevel3(cityMbsj.stream().map(e -> e.getMbsj3()).reduce(Long::sum).orElse(0L));
        response.setLevel3Chuzhi(cityMbsj.stream().map(e -> e.getMbsj3D()).reduce(Long::sum).orElse(0L));

        response.setLevel4(cityMbsj.stream().map(e -> e.getMbsj4()).reduce(Long::sum).orElse(0L));
        response.setLevel4Chuzhi(cityMbsj.stream().map(e -> e.getMbsj4D()).reduce(Long::sum).orElse(0L));

        response.setLevel5(cityMbsj.stream().map(e -> e.getMbsj5()).reduce(Long::sum).orElse(0L));
        response.setLevel5Chuzhi(cityMbsj.stream().map(e -> e.getMbsj5D()).reduce(Long::sum).orElse(0L));
        return response;
    }

    public static List<GjDistrictResponse> mergeDistrict(List<GjDistrictResponse> cityWgxw, List<GjDistrictResponse> cityGjqm, List<GjDistrictResponse> cityTxzd, List<GjDistrictResponse> cityMbsj) {
        Set<String> allCities = Sets.newHashSet();
        Set<String> collect1 = cityWgxw.stream().map(GjDistrictResponse::getDistrictId).collect(Collectors.toSet());
        Set<String> collect2 = cityGjqm.stream().map(GjDistrictResponse::getDistrictId).collect(Collectors.toSet());
        Set<String> collect3 = cityTxzd.stream().map(GjDistrictResponse::getDistrictId).collect(Collectors.toSet());
        Set<String> collect4 = cityMbsj.stream().map(GjDistrictResponse::getDistrictId).collect(Collectors.toSet());
        allCities.addAll(collect1);
        allCities.addAll(collect2);
        allCities.addAll(collect3);
        allCities.addAll(collect4);
        List<GjDistrictResponse> responseList = Lists.newArrayList();
        allCities.forEach(district -> {
            GjDistrictResponse response = new GjDistrictResponse();
            response.setDistrictId(district);
            Optional<GjDistrictResponse> anyWgxw = cityWgxw.stream().filter(wgxw -> wgxw.getDistrictId().equals(district)).findAny();
            if (anyWgxw.isPresent()) {
                response.setWgxwNumber(anyWgxw.get().getWgxwNumber());
                response.setWgxwChuzhi(anyWgxw.get().getWgxwChuzhi());
                response.setLevel1(anyWgxw.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyWgxw.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyWgxw.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyWgxw.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyWgxw.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyWgxw.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyWgxw.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyWgxw.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyWgxw.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyWgxw.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            Optional<GjDistrictResponse> anyGjqm = cityGjqm.stream().filter(gjqm -> gjqm.getDistrictId().equals(district)).findAny();
            if (anyGjqm.isPresent()) {
                response.setGjqmNumber(anyGjqm.get().getGjqmNumber());
                response.setGjqmChuzhi(anyGjqm.get().getGjqmChuzhi());
                response.setLevel1(anyGjqm.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyGjqm.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyGjqm.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyGjqm.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyGjqm.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyGjqm.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyGjqm.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyGjqm.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyGjqm.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyGjqm.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            Optional<GjDistrictResponse> anyTxzd = cityTxzd.stream().filter(gjqm -> gjqm.getDistrictId().equals(district)).findAny();
            if (anyTxzd.isPresent()) {
                response.setTxzdNumber(anyTxzd.get().getTxzdNumber());
                response.setTxzdChuzhi(anyTxzd.get().getTxzdChuzhi());
                response.setLevel1(anyTxzd.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyTxzd.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyTxzd.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyTxzd.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyTxzd.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyTxzd.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyTxzd.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyTxzd.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyTxzd.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyTxzd.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            Optional<GjDistrictResponse> anyMbsj = cityMbsj.stream().filter(gjqm -> gjqm.getDistrictId().equals(district)).findAny();
            if (anyMbsj.isPresent()) {
                response.setMbsjNumber(anyMbsj.get().getMbsjNumber());
                response.setMbsjChuzhi(anyMbsj.get().getMbsjChuzhi());
                response.setLevel1(anyMbsj.get().getLevel1() + response.getLevel1());
                response.setLevel2(anyMbsj.get().getLevel2() + response.getLevel2());
                response.setLevel3(anyMbsj.get().getLevel3() + response.getLevel3());
                response.setLevel4(anyMbsj.get().getLevel4() + response.getLevel4());
                response.setLevel5(anyMbsj.get().getLevel5() + response.getLevel5());
                response.setLevel1Chuzhi(anyMbsj.get().getLevel1Chuzhi() + response.getLevel1Chuzhi());
                response.setLevel2Chuzhi(anyMbsj.get().getLevel2Chuzhi() + response.getLevel2Chuzhi());
                response.setLevel3Chuzhi(anyMbsj.get().getLevel3Chuzhi() + response.getLevel3Chuzhi());
                response.setLevel4Chuzhi(anyMbsj.get().getLevel4Chuzhi() + response.getLevel4Chuzhi());
                response.setLevel5Chuzhi(anyMbsj.get().getLevel5Chuzhi() + response.getLevel5Chuzhi());
            }

            responseList.add(response);
        });
        return responseList;
    }


}
