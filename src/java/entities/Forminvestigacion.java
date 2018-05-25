/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dquijanor
 */
@Entity
@Table(name = "FORMINVESTIGACION", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Forminvestigacion.findAll", query = "SELECT f FROM Forminvestigacion f")
    , @NamedQuery(name = "Forminvestigacion.findById", query = "SELECT f FROM Forminvestigacion f WHERE f.id = :id")
    , @NamedQuery(name = "Forminvestigacion.findByPreinforme", query = "SELECT f FROM Forminvestigacion f WHERE f.preinforme = :preinforme")
    , @NamedQuery(name = "Forminvestigacion.findByPercent", query = "SELECT f FROM Forminvestigacion f WHERE f.percent = :percent")
    , @NamedQuery(name = "Forminvestigacion.findByNitins", query = "SELECT f FROM Forminvestigacion f WHERE f.nitins = :nitins")
    , @NamedQuery(name = "Forminvestigacion.findByNitcon", query = "SELECT f FROM Forminvestigacion f WHERE f.nitcon = :nitcon")
    , @NamedQuery(name = "Forminvestigacion.findByJefaestmayor", query = "SELECT f FROM Forminvestigacion f WHERE f.jefaestmayor = :jefaestmayor")
    , @NamedQuery(name = "Forminvestigacion.findByUnitac", query = "SELECT f FROM Forminvestigacion f WHERE f.unitac = :unitac")
    , @NamedQuery(name = "Forminvestigacion.findByDivcoman", query = "SELECT f FROM Forminvestigacion f WHERE f.divcoman = :divcoman")
    , @NamedQuery(name = "Forminvestigacion.findByFuerzatarea", query = "SELECT f FROM Forminvestigacion f WHERE f.fuerzatarea = :fuerzatarea")
    , @NamedQuery(name = "Forminvestigacion.findByBrigadadireccion", query = "SELECT f FROM Forminvestigacion f WHERE f.brigadadireccion = :brigadadireccion")
    , @NamedQuery(name = "Forminvestigacion.findByCede", query = "SELECT f FROM Forminvestigacion f WHERE f.cede = :cede")
    , @NamedQuery(name = "Forminvestigacion.findByDatenovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.datenovedad = :datenovedad")
    , @NamedQuery(name = "Forminvestigacion.findByHoranovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.horanovedad = :horanovedad")
    , @NamedQuery(name = "Forminvestigacion.findByMinnovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.minnovedad = :minnovedad")
    , @NamedQuery(name = "Forminvestigacion.findByDateanalisis", query = "SELECT f FROM Forminvestigacion f WHERE f.dateanalisis = :dateanalisis")
    , @NamedQuery(name = "Forminvestigacion.findByZonanovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.zonanovedad = :zonanovedad")
    , @NamedQuery(name = "Forminvestigacion.findByCoordireccion", query = "SELECT f FROM Forminvestigacion f WHERE f.coordireccion = :coordireccion")
    , @NamedQuery(name = "Forminvestigacion.findByPaisnovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.paisnovedad = :paisnovedad")
    , @NamedQuery(name = "Forminvestigacion.findByDepnovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.depnovedad = :depnovedad")
    , @NamedQuery(name = "Forminvestigacion.findByCiudadnovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.ciudadnovedad = :ciudadnovedad")
    , @NamedQuery(name = "Forminvestigacion.findByCaraclugar", query = "SELECT f FROM Forminvestigacion f WHERE f.caraclugar = :caraclugar")
    , @NamedQuery(name = "Forminvestigacion.findBySitioespecifico", query = "SELECT f FROM Forminvestigacion f WHERE f.sitioespecifico = :sitioespecifico")
    , @NamedQuery(name = "Forminvestigacion.findByClasenovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.clasenovedad = :clasenovedad")
    , @NamedQuery(name = "Forminvestigacion.findByNovedadinternafuerza", query = "SELECT f FROM Forminvestigacion f WHERE f.novedadinternafuerza = :novedadinternafuerza")
    , @NamedQuery(name = "Forminvestigacion.findByNovedadinternafuerzasub", query = "SELECT f FROM Forminvestigacion f WHERE f.novedadinternafuerzasub = :novedadinternafuerzasub")
    , @NamedQuery(name = "Forminvestigacion.findByGravedad", query = "SELECT f FROM Forminvestigacion f WHERE f.gravedad = :gravedad")
    , @NamedQuery(name = "Forminvestigacion.findByPartecuerpo", query = "SELECT f FROM Forminvestigacion f WHERE f.partecuerpo = :partecuerpo")
    , @NamedQuery(name = "Forminvestigacion.findByPartecuerpodes", query = "SELECT f FROM Forminvestigacion f WHERE f.partecuerpodes = :partecuerpodes")
    , @NamedQuery(name = "Forminvestigacion.findByAtencioninmediata", query = "SELECT f FROM Forminvestigacion f WHERE f.atencioninmediata = :atencioninmediata")
    , @NamedQuery(name = "Forminvestigacion.findByInfogrado", query = "SELECT f FROM Forminvestigacion f WHERE f.infogrado = :infogrado")
    , @NamedQuery(name = "Forminvestigacion.findByInfocargo", query = "SELECT f FROM Forminvestigacion f WHERE f.infocargo = :infocargo")
    , @NamedQuery(name = "Forminvestigacion.findByInfoname", query = "SELECT f FROM Forminvestigacion f WHERE f.infoname = :infoname")
    , @NamedQuery(name = "Forminvestigacion.findByInfoextrelacion", query = "SELECT f FROM Forminvestigacion f WHERE f.infoextrelacion = :infoextrelacion")
    , @NamedQuery(name = "Forminvestigacion.findByInfoextname", query = "SELECT f FROM Forminvestigacion f WHERE f.infoextname = :infoextname")
    , @NamedQuery(name = "Forminvestigacion.findByFuenteagente", query = "SELECT f FROM Forminvestigacion f WHERE f.fuenteagente = :fuenteagente")
    , @NamedQuery(name = "Forminvestigacion.findByAgente", query = "SELECT f FROM Forminvestigacion f WHERE f.agente = :agente")
    , @NamedQuery(name = "Forminvestigacion.findByOtroagente", query = "SELECT f FROM Forminvestigacion f WHERE f.otroagente = :otroagente")
    , @NamedQuery(name = "Forminvestigacion.findByMecalesion", query = "SELECT f FROM Forminvestigacion f WHERE f.mecalesion = :mecalesion")
    , @NamedQuery(name = "Forminvestigacion.findByNombrereporta", query = "SELECT f FROM Forminvestigacion f WHERE f.nombrereporta = :nombrereporta")
    , @NamedQuery(name = "Forminvestigacion.findByGradoreporta", query = "SELECT f FROM Forminvestigacion f WHERE f.gradoreporta = :gradoreporta")
    , @NamedQuery(name = "Forminvestigacion.findByCargoreporta", query = "SELECT f FROM Forminvestigacion f WHERE f.cargoreporta = :cargoreporta")
    , @NamedQuery(name = "Forminvestigacion.findByPnombre", query = "SELECT f FROM Forminvestigacion f WHERE f.pnombre = :pnombre")
    , @NamedQuery(name = "Forminvestigacion.findBySnombre", query = "SELECT f FROM Forminvestigacion f WHERE f.snombre = :snombre")
    , @NamedQuery(name = "Forminvestigacion.findByPapellido", query = "SELECT f FROM Forminvestigacion f WHERE f.papellido = :papellido")
    , @NamedQuery(name = "Forminvestigacion.findBySapellido", query = "SELECT f FROM Forminvestigacion f WHERE f.sapellido = :sapellido")
    , @NamedQuery(name = "Forminvestigacion.findByPersogrado", query = "SELECT f FROM Forminvestigacion f WHERE f.persogrado = :persogrado")
    , @NamedQuery(name = "Forminvestigacion.findByPersocargo", query = "SELECT f FROM Forminvestigacion f WHERE f.persocargo = :persocargo")
    , @NamedQuery(name = "Forminvestigacion.findByArmacuerpoesp", query = "SELECT f FROM Forminvestigacion f WHERE f.armacuerpoesp = :armacuerpoesp")
    , @NamedQuery(name = "Forminvestigacion.findByPersodoc", query = "SELECT f FROM Forminvestigacion f WHERE f.persodoc = :persodoc")
    , @NamedQuery(name = "Forminvestigacion.findByDatepersonnac", query = "SELECT f FROM Forminvestigacion f WHERE f.datepersonnac = :datepersonnac")
    , @NamedQuery(name = "Forminvestigacion.findByLugarpersonnac", query = "SELECT f FROM Forminvestigacion f WHERE f.lugarpersonnac = :lugarpersonnac")
    , @NamedQuery(name = "Forminvestigacion.findByDatepersoningre", query = "SELECT f FROM Forminvestigacion f WHERE f.datepersoningre = :datepersoningre")
    , @NamedQuery(name = "Forminvestigacion.findByPersoncontingente", query = "SELECT f FROM Forminvestigacion f WHERE f.personcontingente = :personcontingente")
    , @NamedQuery(name = "Forminvestigacion.findByTimeposervicioanos", query = "SELECT f FROM Forminvestigacion f WHERE f.timeposervicioanos = :timeposervicioanos")
    , @NamedQuery(name = "Forminvestigacion.findByTimeposerviciomeses", query = "SELECT f FROM Forminvestigacion f WHERE f.timeposerviciomeses = :timeposerviciomeses")
    , @NamedQuery(name = "Forminvestigacion.findByTimeposervicioanosunidad", query = "SELECT f FROM Forminvestigacion f WHERE f.timeposervicioanosunidad = :timeposervicioanosunidad")
    , @NamedQuery(name = "Forminvestigacion.findByTimeposerviciomesesunidad", query = "SELECT f FROM Forminvestigacion f WHERE f.timeposerviciomesesunidad = :timeposerviciomesesunidad")
    , @NamedQuery(name = "Forminvestigacion.findByHoraslaborado", query = "SELECT f FROM Forminvestigacion f WHERE f.horaslaborado = :horaslaborado")
    , @NamedQuery(name = "Forminvestigacion.findByMinlaborado", query = "SELECT f FROM Forminvestigacion f WHERE f.minlaborado = :minlaborado")
    , @NamedQuery(name = "Forminvestigacion.findByTimeposervicioanoscargo", query = "SELECT f FROM Forminvestigacion f WHERE f.timeposervicioanoscargo = :timeposervicioanoscargo")
    , @NamedQuery(name = "Forminvestigacion.findByTimeposerviciomesescargo", query = "SELECT f FROM Forminvestigacion f WHERE f.timeposerviciomesescargo = :timeposerviciomesescargo")
    , @NamedQuery(name = "Forminvestigacion.findByPersondireccion", query = "SELECT f FROM Forminvestigacion f WHERE f.persondireccion = :persondireccion")
    , @NamedQuery(name = "Forminvestigacion.findByPersonciudad", query = "SELECT f FROM Forminvestigacion f WHERE f.personciudad = :personciudad")
    , @NamedQuery(name = "Forminvestigacion.findByPersontel", query = "SELECT f FROM Forminvestigacion f WHERE f.persontel = :persontel")
    , @NamedQuery(name = "Forminvestigacion.findByPersonedad", query = "SELECT f FROM Forminvestigacion f WHERE f.personedad = :personedad")
    , @NamedQuery(name = "Forminvestigacion.findByPersonsexo", query = "SELECT f FROM Forminvestigacion f WHERE f.personsexo = :personsexo")
    , @NamedQuery(name = "Forminvestigacion.findByPersonestado", query = "SELECT f FROM Forminvestigacion f WHERE f.personestado = :personestado")
    , @NamedQuery(name = "Forminvestigacion.findByPersonescolaridad", query = "SELECT f FROM Forminvestigacion f WHERE f.personescolaridad = :personescolaridad")
    , @NamedQuery(name = "Forminvestigacion.findByPersonsalario", query = "SELECT f FROM Forminvestigacion f WHERE f.personsalario = :personsalario")
    , @NamedQuery(name = "Forminvestigacion.findByPersonserviciosalud", query = "SELECT f FROM Forminvestigacion f WHERE f.personserviciosalud = :personserviciosalud")
    , @NamedQuery(name = "Forminvestigacion.findByPersonservicioeps", query = "SELECT f FROM Forminvestigacion f WHERE f.personservicioeps = :personservicioeps")
    , @NamedQuery(name = "Forminvestigacion.findByPersonservicioarl", query = "SELECT f FROM Forminvestigacion f WHERE f.personservicioarl = :personservicioarl")
    , @NamedQuery(name = "Forminvestigacion.findByPersonserviciotipovincu", query = "SELECT f FROM Forminvestigacion f WHERE f.personserviciotipovincu = :personserviciotipovincu")
    , @NamedQuery(name = "Forminvestigacion.findByPersonactividad", query = "SELECT f FROM Forminvestigacion f WHERE f.personactividad = :personactividad")
    , @NamedQuery(name = "Forminvestigacion.findByPersonactividaddurantenovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.personactividaddurantenovedad = :personactividaddurantenovedad")
    , @NamedQuery(name = "Forminvestigacion.findByPersonafp", query = "SELECT f FROM Forminvestigacion f WHERE f.personafp = :personafp")
    , @NamedQuery(name = "Forminvestigacion.findByPersontrabajoespecifico", query = "SELECT f FROM Forminvestigacion f WHERE f.persontrabajoespecifico = :persontrabajoespecifico")
    , @NamedQuery(name = "Forminvestigacion.findByPersonexpano", query = "SELECT f FROM Forminvestigacion f WHERE f.personexpano = :personexpano")
    , @NamedQuery(name = "Forminvestigacion.findByPersonexpmeses", query = "SELECT f FROM Forminvestigacion f WHERE f.personexpmeses = :personexpmeses")
    , @NamedQuery(name = "Forminvestigacion.findByPersonexpdias", query = "SELECT f FROM Forminvestigacion f WHERE f.personexpdias = :personexpdias")
    , @NamedQuery(name = "Forminvestigacion.findByPersoncapacitacionesdes", query = "SELECT f FROM Forminvestigacion f WHERE f.personcapacitacionesdes = :personcapacitacionesdes")
    , @NamedQuery(name = "Forminvestigacion.findByDateultdesc", query = "SELECT f FROM Forminvestigacion f WHERE f.dateultdesc = :dateultdesc")
    , @NamedQuery(name = "Forminvestigacion.findByDateultreentre", query = "SELECT f FROM Forminvestigacion f WHERE f.dateultreentre = :dateultreentre")
    , @NamedQuery(name = "Forminvestigacion.findByDeshechospresonal", query = "SELECT f FROM Forminvestigacion f WHERE f.deshechospresonal = :deshechospresonal")
    , @NamedQuery(name = "Forminvestigacion.findByDesdetalladanovedad", query = "SELECT f FROM Forminvestigacion f WHERE f.desdetalladanovedad = :desdetalladanovedad")
    , @NamedQuery(name = "Forminvestigacion.findByDesdetalladahechos", query = "SELECT f FROM Forminvestigacion f WHERE f.desdetalladahechos = :desdetalladahechos")
    , @NamedQuery(name = "Forminvestigacion.findByDesfalla", query = "SELECT f FROM Forminvestigacion f WHERE f.desfalla = :desfalla")
    , @NamedQuery(name = "Forminvestigacion.findByDesconsecuencias", query = "SELECT f FROM Forminvestigacion f WHERE f.desconsecuencias = :desconsecuencias")
    , @NamedQuery(name = "Forminvestigacion.findByDesact", query = "SELECT f FROM Forminvestigacion f WHERE f.desact = :desact")
    , @NamedQuery(name = "Forminvestigacion.findByCondiequipodes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiequipodes = :condiequipodes")
    , @NamedQuery(name = "Forminvestigacion.findByCondilugardes", query = "SELECT f FROM Forminvestigacion f WHERE f.condilugardes = :condilugardes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiambdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiambdes = :condiambdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiordenpublicodes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiordenpublicodes = :condiordenpublicodes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiorgdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiorgdes = :condiorgdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondicomrelaciondes", query = "SELECT f FROM Forminvestigacion f WHERE f.condicomrelaciondes = :condicomrelaciondes")
    , @NamedQuery(name = "Forminvestigacion.findByCondicultseguridaddes", query = "SELECT f FROM Forminvestigacion f WHERE f.condicultseguridaddes = :condicultseguridaddes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiliderazgodes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiliderazgodes = :condiliderazgodes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiprocedimientodes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiprocedimientodes = :condiprocedimientodes")
    , @NamedQuery(name = "Forminvestigacion.findByCondirecursosdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condirecursosdes = :condirecursosdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondisupervisiondes", query = "SELECT f FROM Forminvestigacion f WHERE f.condisupervisiondes = :condisupervisiondes")
    , @NamedQuery(name = "Forminvestigacion.findByCondicompetenciades", query = "SELECT f FROM Forminvestigacion f WHERE f.condicompetenciades = :condicompetenciades")
    , @NamedQuery(name = "Forminvestigacion.findByCondicognitivades", query = "SELECT f FROM Forminvestigacion f WHERE f.condicognitivades = :condicognitivades")
    , @NamedQuery(name = "Forminvestigacion.findByCondiemocionalesdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiemocionalesdes = :condiemocionalesdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiconotrosdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiconotrosdes = :condiconotrosdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondifisicasdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condifisicasdes = :condifisicasdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondicomportamentalesdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condicomportamentalesdes = :condicomportamentalesdes")
    , @NamedQuery(name = "Forminvestigacion.findByConditercerosdes", query = "SELECT f FROM Forminvestigacion f WHERE f.conditercerosdes = :conditercerosdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiidcontroldes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiidcontroldes = :condiidcontroldes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiusomaterialdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiusomaterialdes = :condiusomaterialdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondimanejotransportedes", query = "SELECT f FROM Forminvestigacion f WHERE f.condimanejotransportedes = :condimanejotransportedes")
    , @NamedQuery(name = "Forminvestigacion.findByCondieppkitdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condieppkitdes = :condieppkitdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondieppkitdesvehi", query = "SELECT f FROM Forminvestigacion f WHERE f.condieppkitdesvehi = :condieppkitdesvehi")
    , @NamedQuery(name = "Forminvestigacion.findByCondiposturasdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiposturasdes = :condiposturasdes")
    , @NamedQuery(name = "Forminvestigacion.findByCondiarmmunexplodes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiarmmunexplodes = :condiarmmunexplodes")
    , @NamedQuery(name = "Forminvestigacion.findByCondicompviades", query = "SELECT f FROM Forminvestigacion f WHERE f.condicompviades = :condicompviades")
    , @NamedQuery(name = "Forminvestigacion.findByCondiautoinflingidasdes", query = "SELECT f FROM Forminvestigacion f WHERE f.condiautoinflingidasdes = :condiautoinflingidasdes")
    , @NamedQuery(name = "Forminvestigacion.findByVialtipovehi", query = "SELECT f FROM Forminvestigacion f WHERE f.vialtipovehi = :vialtipovehi")
    , @NamedQuery(name = "Forminvestigacion.findByVialplaca", query = "SELECT f FROM Forminvestigacion f WHERE f.vialplaca = :vialplaca")
    , @NamedQuery(name = "Forminvestigacion.findByVialmarca", query = "SELECT f FROM Forminvestigacion f WHERE f.vialmarca = :vialmarca")
    , @NamedQuery(name = "Forminvestigacion.findByVialcilindraje", query = "SELECT f FROM Forminvestigacion f WHERE f.vialcilindraje = :vialcilindraje")
    , @NamedQuery(name = "Forminvestigacion.findByVialdeptres", query = "SELECT f FROM Forminvestigacion f WHERE f.vialdeptres = :vialdeptres")
    , @NamedQuery(name = "Forminvestigacion.findByVialsoat", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsoat = :vialsoat")
    , @NamedQuery(name = "Forminvestigacion.findByVialestadolicencia", query = "SELECT f FROM Forminvestigacion f WHERE f.vialestadolicencia = :vialestadolicencia")
    , @NamedQuery(name = "Forminvestigacion.findByVialdesdanos", query = "SELECT f FROM Forminvestigacion f WHERE f.vialdesdanos = :vialdesdanos")
    , @NamedQuery(name = "Forminvestigacion.findByVialcostorep", query = "SELECT f FROM Forminvestigacion f WHERE f.vialcostorep = :vialcostorep")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegtipovehi", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegtipovehi = :vialsegtipovehi")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegplaca", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegplaca = :vialsegplaca")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegmarca", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegmarca = :vialsegmarca")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegcilindraje", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegcilindraje = :vialsegcilindraje")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegdeptres", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegdeptres = :vialsegdeptres")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegsoat", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegsoat = :vialsegsoat")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegestadolicencia", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegestadolicencia = :vialsegestadolicencia")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegdesdanos", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegdesdanos = :vialsegdesdanos")
    , @NamedQuery(name = "Forminvestigacion.findByVialsegcostorep", query = "SELECT f FROM Forminvestigacion f WHERE f.vialsegcostorep = :vialsegcostorep")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdhum", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdhum = :desperdhum")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdamb", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdamb = :desperdamb")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdmater", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdmater = :desperdmater")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdotras", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdotras = :desperdotras")
    , @NamedQuery(name = "Forminvestigacion.findByDesperddias", query = "SELECT f FROM Forminvestigacion f WHERE f.desperddias = :desperddias")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdnumeromuertos", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdnumeromuertos = :desperdnumeromuertos")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdafectacion", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdafectacion = :desperdafectacion")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdestimacionvalor", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdestimacionvalor = :desperdestimacionvalor")
    , @NamedQuery(name = "Forminvestigacion.findByDesperdgeneral", query = "SELECT f FROM Forminvestigacion f WHERE f.desperdgeneral = :desperdgeneral")
    , @NamedQuery(name = "Forminvestigacion.findByEntreiduno", query = "SELECT f FROM Forminvestigacion f WHERE f.entreiduno = :entreiduno")
    , @NamedQuery(name = "Forminvestigacion.findByEntrecargouno", query = "SELECT f FROM Forminvestigacion f WHERE f.entrecargouno = :entrecargouno")
    , @NamedQuery(name = "Forminvestigacion.findByEntreteluno", query = "SELECT f FROM Forminvestigacion f WHERE f.entreteluno = :entreteluno")
    , @NamedQuery(name = "Forminvestigacion.findByEntredesuno", query = "SELECT f FROM Forminvestigacion f WHERE f.entredesuno = :entredesuno")
    , @NamedQuery(name = "Forminvestigacion.findByEntreiddos", query = "SELECT f FROM Forminvestigacion f WHERE f.entreiddos = :entreiddos")
    , @NamedQuery(name = "Forminvestigacion.findByEntrecargodos", query = "SELECT f FROM Forminvestigacion f WHERE f.entrecargodos = :entrecargodos")
    , @NamedQuery(name = "Forminvestigacion.findByEntreteldos", query = "SELECT f FROM Forminvestigacion f WHERE f.entreteldos = :entreteldos")
    , @NamedQuery(name = "Forminvestigacion.findByEntredesdos", query = "SELECT f FROM Forminvestigacion f WHERE f.entredesdos = :entredesdos")
    , @NamedQuery(name = "Forminvestigacion.findByEntredesafectado", query = "SELECT f FROM Forminvestigacion f WHERE f.entredesafectado = :entredesafectado")
    , @NamedQuery(name = "Forminvestigacion.findByRevcumplio", query = "SELECT f FROM Forminvestigacion f WHERE f.revcumplio = :revcumplio")
    , @NamedQuery(name = "Forminvestigacion.findByRevcausas", query = "SELECT f FROM Forminvestigacion f WHERE f.revcausas = :revcausas")
    , @NamedQuery(name = "Forminvestigacion.findByRevmedidas", query = "SELECT f FROM Forminvestigacion f WHERE f.revmedidas = :revmedidas")
    , @NamedQuery(name = "Forminvestigacion.findByRegistrofilename1", query = "SELECT f FROM Forminvestigacion f WHERE f.registrofilename1 = :registrofilename1")
    , @NamedQuery(name = "Forminvestigacion.findByRegistrofilename2", query = "SELECT f FROM Forminvestigacion f WHERE f.registrofilename2 = :registrofilename2")
    , @NamedQuery(name = "Forminvestigacion.findByRegistrofilename3", query = "SELECT f FROM Forminvestigacion f WHERE f.registrofilename3 = :registrofilename3")
    , @NamedQuery(name = "Forminvestigacion.findByImgfirmas", query = "SELECT f FROM Forminvestigacion f WHERE f.imgfirmas = :imgfirmas")
    , @NamedQuery(name = "Forminvestigacion.findByIduser", query = "SELECT f FROM Forminvestigacion f WHERE f.iduser = :iduser")
    , @NamedQuery(name = "Forminvestigacion.findByDatecreacion", query = "SELECT f FROM Forminvestigacion f WHERE f.datecreacion = :datecreacion")
    , @NamedQuery(name = "Forminvestigacion.findByUsuarioCreador", query = "SELECT f FROM Forminvestigacion f WHERE f.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "Forminvestigacion.findByFechaCreacion", query = "SELECT f FROM Forminvestigacion f WHERE f.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Forminvestigacion.findByUsuarioModificador", query = "SELECT f FROM Forminvestigacion f WHERE f.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "Forminvestigacion.findByFechaModificacion", query = "SELECT f FROM Forminvestigacion f WHERE f.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "Forminvestigacion.findByGrupoInformacion", query = "SELECT f FROM Forminvestigacion f WHERE f.grupoInformacion = :grupoInformacion")})
public class Forminvestigacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false, precision = 22)
    private BigDecimal id;
    @Size(max = 200)
    @Column(name = "PREINFORME", length = 200)
    private String preinforme;
    @Column(name = "PERCENT")
    private BigInteger percent;
    @Size(max = 100)
    @Column(name = "NITINS", length = 100)
    private String nitins;
    @Size(max = 100)
    @Column(name = "NITCON", length = 100)
    private String nitcon;
    @Size(max = 100)
    @Column(name = "JEFAESTMAYOR", length = 100)
    private String jefaestmayor;
    @Size(max = 100)
    @Column(name = "UNITAC", length = 100)
    private String unitac;
    @Size(max = 100)
    @Column(name = "DIVCOMAN", length = 100)
    private String divcoman;
    @Size(max = 100)
    @Column(name = "FUERZATAREA", length = 100)
    private String fuerzatarea;
    @Size(max = 100)
    @Column(name = "BRIGADADIRECCION", length = 100)
    private String brigadadireccion;
    @Size(max = 100)
    @Column(name = "CEDE", length = 100)
    private String cede;
    @Size(max = 100)
    @Column(name = "DATENOVEDAD", length = 100)
    private String datenovedad;
    @Size(max = 100)
    @Column(name = "HORANOVEDAD", length = 100)
    private String horanovedad;
    @Size(max = 100)
    @Column(name = "MINNOVEDAD", length = 100)
    private String minnovedad;
    @Size(max = 100)
    @Column(name = "DATEANALISIS", length = 100)
    private String dateanalisis;
    @Size(max = 100)
    @Column(name = "ZONANOVEDAD", length = 100)
    private String zonanovedad;
    @Size(max = 100)
    @Column(name = "COORDIRECCION", length = 100)
    private String coordireccion;
    @Size(max = 100)
    @Column(name = "PAISNOVEDAD", length = 100)
    private String paisnovedad;
    @Size(max = 100)
    @Column(name = "DEPNOVEDAD", length = 100)
    private String depnovedad;
    @Size(max = 100)
    @Column(name = "CIUDADNOVEDAD", length = 100)
    private String ciudadnovedad;
    @Size(max = 100)
    @Column(name = "CARACLUGAR", length = 100)
    private String caraclugar;
    @Size(max = 100)
    @Column(name = "SITIOESPECIFICO", length = 100)
    private String sitioespecifico;
    @Size(max = 100)
    @Column(name = "CLASENOVEDAD", length = 100)
    private String clasenovedad;
    @Size(max = 100)
    @Column(name = "NOVEDADINTERNAFUERZA", length = 100)
    private String novedadinternafuerza;
    @Size(max = 100)
    @Column(name = "NOVEDADINTERNAFUERZASUB", length = 100)
    private String novedadinternafuerzasub;
    @Size(max = 100)
    @Column(name = "GRAVEDAD", length = 100)
    private String gravedad;
    @Size(max = 100)
    @Column(name = "PARTECUERPO", length = 100)
    private String partecuerpo;
    @Size(max = 100)
    @Column(name = "PARTECUERPODES", length = 100)
    private String partecuerpodes;
    @Size(max = 100)
    @Column(name = "ATENCIONINMEDIATA", length = 100)
    private String atencioninmediata;
    @Size(max = 100)
    @Column(name = "INFOGRADO", length = 100)
    private String infogrado;
    @Size(max = 100)
    @Column(name = "INFOCARGO", length = 100)
    private String infocargo;
    @Size(max = 100)
    @Column(name = "INFONAME", length = 100)
    private String infoname;
    @Size(max = 100)
    @Column(name = "INFOEXTRELACION", length = 100)
    private String infoextrelacion;
    @Size(max = 100)
    @Column(name = "INFOEXTNAME", length = 100)
    private String infoextname;
    @Size(max = 100)
    @Column(name = "FUENTEAGENTE", length = 100)
    private String fuenteagente;
    @Size(max = 100)
    @Column(name = "AGENTE", length = 100)
    private String agente;
    @Size(max = 100)
    @Column(name = "OTROAGENTE", length = 100)
    private String otroagente;
    @Size(max = 100)
    @Column(name = "MECALESION", length = 100)
    private String mecalesion;
    @Size(max = 100)
    @Column(name = "NOMBREREPORTA", length = 100)
    private String nombrereporta;
    @Size(max = 100)
    @Column(name = "GRADOREPORTA", length = 100)
    private String gradoreporta;
    @Size(max = 100)
    @Column(name = "CARGOREPORTA", length = 100)
    private String cargoreporta;
    @Size(max = 100)
    @Column(name = "PNOMBRE", length = 100)
    private String pnombre;
    @Size(max = 100)
    @Column(name = "SNOMBRE", length = 100)
    private String snombre;
    @Size(max = 100)
    @Column(name = "PAPELLIDO", length = 100)
    private String papellido;
    @Size(max = 100)
    @Column(name = "SAPELLIDO", length = 100)
    private String sapellido;
    @Size(max = 100)
    @Column(name = "PERSOGRADO", length = 100)
    private String persogrado;
    @Size(max = 100)
    @Column(name = "PERSOCARGO", length = 100)
    private String persocargo;
    @Size(max = 100)
    @Column(name = "ARMACUERPOESP", length = 100)
    private String armacuerpoesp;
    @Size(max = 100)
    @Column(name = "PERSODOC", length = 100)
    private String persodoc;
    @Size(max = 100)
    @Column(name = "DATEPERSONNAC", length = 100)
    private String datepersonnac;
    @Size(max = 100)
    @Column(name = "LUGARPERSONNAC", length = 100)
    private String lugarpersonnac;
    @Size(max = 100)
    @Column(name = "DATEPERSONINGRE", length = 100)
    private String datepersoningre;
    @Size(max = 100)
    @Column(name = "PERSONCONTINGENTE", length = 100)
    private String personcontingente;
    @Size(max = 100)
    @Column(name = "TIMEPOSERVICIOANOS", length = 100)
    private String timeposervicioanos;
    @Size(max = 100)
    @Column(name = "TIMEPOSERVICIOMESES", length = 100)
    private String timeposerviciomeses;
    @Size(max = 100)
    @Column(name = "TIMEPOSERVICIOANOSUNIDAD", length = 100)
    private String timeposervicioanosunidad;
    @Size(max = 100)
    @Column(name = "TIMEPOSERVICIOMESESUNIDAD", length = 100)
    private String timeposerviciomesesunidad;
    @Size(max = 100)
    @Column(name = "HORASLABORADO", length = 100)
    private String horaslaborado;
    @Size(max = 100)
    @Column(name = "MINLABORADO", length = 100)
    private String minlaborado;
    @Size(max = 100)
    @Column(name = "TIMEPOSERVICIOANOSCARGO", length = 100)
    private String timeposervicioanoscargo;
    @Size(max = 100)
    @Column(name = "TIMEPOSERVICIOMESESCARGO", length = 100)
    private String timeposerviciomesescargo;
    @Size(max = 100)
    @Column(name = "PERSONDIRECCION", length = 100)
    private String persondireccion;
    @Size(max = 100)
    @Column(name = "PERSONCIUDAD", length = 100)
    private String personciudad;
    @Size(max = 100)
    @Column(name = "PERSONTEL", length = 100)
    private String persontel;
    @Size(max = 100)
    @Column(name = "PERSONEDAD", length = 100)
    private String personedad;
    @Size(max = 100)
    @Column(name = "PERSONSEXO", length = 100)
    private String personsexo;
    @Size(max = 100)
    @Column(name = "PERSONESTADO", length = 100)
    private String personestado;
    @Size(max = 100)
    @Column(name = "PERSONESCOLARIDAD", length = 100)
    private String personescolaridad;
    @Size(max = 100)
    @Column(name = "PERSONSALARIO", length = 100)
    private String personsalario;
    @Size(max = 100)
    @Column(name = "PERSONSERVICIOSALUD", length = 100)
    private String personserviciosalud;
    @Size(max = 100)
    @Column(name = "PERSONSERVICIOEPS", length = 100)
    private String personservicioeps;
    @Size(max = 100)
    @Column(name = "PERSONSERVICIOARL", length = 100)
    private String personservicioarl;
    @Size(max = 100)
    @Column(name = "PERSONSERVICIOTIPOVINCU", length = 100)
    private String personserviciotipovincu;
    @Size(max = 100)
    @Column(name = "PERSONACTIVIDAD", length = 100)
    private String personactividad;
    @Size(max = 100)
    @Column(name = "PERSONACTIVIDADDURANTENOVEDAD", length = 100)
    private String personactividaddurantenovedad;
    @Size(max = 100)
    @Column(name = "PERSONAFP", length = 100)
    private String personafp;
    @Size(max = 100)
    @Column(name = "PERSONTRABAJOESPECIFICO", length = 100)
    private String persontrabajoespecifico;
    @Size(max = 100)
    @Column(name = "PERSONEXPANO", length = 100)
    private String personexpano;
    @Size(max = 100)
    @Column(name = "PERSONEXPMESES", length = 100)
    private String personexpmeses;
    @Size(max = 100)
    @Column(name = "PERSONEXPDIAS", length = 100)
    private String personexpdias;
    @Size(max = 100)
    @Column(name = "PERSONCAPACITACIONESDES", length = 100)
    private String personcapacitacionesdes;
    @Size(max = 100)
    @Column(name = "DATEULTDESC", length = 100)
    private String dateultdesc;
    @Size(max = 100)
    @Column(name = "DATEULTREENTRE", length = 100)
    private String dateultreentre;
    @Size(max = 100)
    @Column(name = "DESHECHOSPRESONAL", length = 100)
    private String deshechospresonal;
    @Size(max = 100)
    @Column(name = "DESDETALLADANOVEDAD", length = 100)
    private String desdetalladanovedad;
    @Size(max = 100)
    @Column(name = "DESDETALLADAHECHOS", length = 100)
    private String desdetalladahechos;
    @Size(max = 100)
    @Column(name = "DESFALLA", length = 100)
    private String desfalla;
    @Size(max = 100)
    @Column(name = "DESCONSECUENCIAS", length = 100)
    private String desconsecuencias;
    @Size(max = 100)
    @Column(name = "DESACT", length = 100)
    private String desact;
    @Size(max = 100)
    @Column(name = "CONDIEQUIPODES", length = 100)
    private String condiequipodes;
    @Size(max = 100)
    @Column(name = "CONDILUGARDES", length = 100)
    private String condilugardes;
    @Size(max = 100)
    @Column(name = "CONDIAMBDES", length = 100)
    private String condiambdes;
    @Size(max = 100)
    @Column(name = "CONDIORDENPUBLICODES", length = 100)
    private String condiordenpublicodes;
    @Size(max = 100)
    @Column(name = "CONDIORGDES", length = 100)
    private String condiorgdes;
    @Size(max = 100)
    @Column(name = "CONDICOMRELACIONDES", length = 100)
    private String condicomrelaciondes;
    @Size(max = 100)
    @Column(name = "CONDICULTSEGURIDADDES", length = 100)
    private String condicultseguridaddes;
    @Size(max = 100)
    @Column(name = "CONDILIDERAZGODES", length = 100)
    private String condiliderazgodes;
    @Size(max = 100)
    @Column(name = "CONDIPROCEDIMIENTODES", length = 100)
    private String condiprocedimientodes;
    @Size(max = 100)
    @Column(name = "CONDIRECURSOSDES", length = 100)
    private String condirecursosdes;
    @Size(max = 100)
    @Column(name = "CONDISUPERVISIONDES", length = 100)
    private String condisupervisiondes;
    @Size(max = 100)
    @Column(name = "CONDICOMPETENCIADES", length = 100)
    private String condicompetenciades;
    @Size(max = 100)
    @Column(name = "CONDICOGNITIVADES", length = 100)
    private String condicognitivades;
    @Size(max = 100)
    @Column(name = "CONDIEMOCIONALESDES", length = 100)
    private String condiemocionalesdes;
    @Size(max = 100)
    @Column(name = "CONDICONOTROSDES", length = 100)
    private String condiconotrosdes;
    @Size(max = 100)
    @Column(name = "CONDIFISICASDES", length = 100)
    private String condifisicasdes;
    @Size(max = 100)
    @Column(name = "CONDICOMPORTAMENTALESDES", length = 100)
    private String condicomportamentalesdes;
    @Size(max = 100)
    @Column(name = "CONDITERCEROSDES", length = 100)
    private String conditercerosdes;
    @Size(max = 100)
    @Column(name = "CONDIIDCONTROLDES", length = 100)
    private String condiidcontroldes;
    @Size(max = 100)
    @Column(name = "CONDIUSOMATERIALDES", length = 100)
    private String condiusomaterialdes;
    @Size(max = 100)
    @Column(name = "CONDIMANEJOTRANSPORTEDES", length = 100)
    private String condimanejotransportedes;
    @Size(max = 100)
    @Column(name = "CONDIEPPKITDES", length = 100)
    private String condieppkitdes;
    @Size(max = 100)
    @Column(name = "CONDIEPPKITDESVEHI", length = 100)
    private String condieppkitdesvehi;
    @Size(max = 100)
    @Column(name = "CONDIPOSTURASDES", length = 100)
    private String condiposturasdes;
    @Size(max = 100)
    @Column(name = "CONDIARMMUNEXPLODES", length = 100)
    private String condiarmmunexplodes;
    @Size(max = 100)
    @Column(name = "CONDICOMPVIADES", length = 100)
    private String condicompviades;
    @Size(max = 100)
    @Column(name = "CONDIAUTOINFLINGIDASDES", length = 100)
    private String condiautoinflingidasdes;
    @Size(max = 100)
    @Column(name = "VIALTIPOVEHI", length = 100)
    private String vialtipovehi;
    @Size(max = 100)
    @Column(name = "VIALPLACA", length = 100)
    private String vialplaca;
    @Size(max = 100)
    @Column(name = "VIALMARCA", length = 100)
    private String vialmarca;
    @Size(max = 100)
    @Column(name = "VIALCILINDRAJE", length = 100)
    private String vialcilindraje;
    @Size(max = 100)
    @Column(name = "VIALDEPTRES", length = 100)
    private String vialdeptres;
    @Size(max = 100)
    @Column(name = "VIALSOAT", length = 100)
    private String vialsoat;
    @Size(max = 100)
    @Column(name = "VIALESTADOLICENCIA", length = 100)
    private String vialestadolicencia;
    @Size(max = 100)
    @Column(name = "VIALDESDANOS", length = 100)
    private String vialdesdanos;
    @Size(max = 100)
    @Column(name = "VIALCOSTOREP", length = 100)
    private String vialcostorep;
    @Size(max = 100)
    @Column(name = "VIALSEGTIPOVEHI", length = 100)
    private String vialsegtipovehi;
    @Size(max = 100)
    @Column(name = "VIALSEGPLACA", length = 100)
    private String vialsegplaca;
    @Size(max = 100)
    @Column(name = "VIALSEGMARCA", length = 100)
    private String vialsegmarca;
    @Size(max = 100)
    @Column(name = "VIALSEGCILINDRAJE", length = 100)
    private String vialsegcilindraje;
    @Size(max = 100)
    @Column(name = "VIALSEGDEPTRES", length = 100)
    private String vialsegdeptres;
    @Size(max = 100)
    @Column(name = "VIALSEGSOAT", length = 100)
    private String vialsegsoat;
    @Size(max = 100)
    @Column(name = "VIALSEGESTADOLICENCIA", length = 100)
    private String vialsegestadolicencia;
    @Size(max = 100)
    @Column(name = "VIALSEGDESDANOS", length = 100)
    private String vialsegdesdanos;
    @Size(max = 100)
    @Column(name = "VIALSEGCOSTOREP", length = 100)
    private String vialsegcostorep;
    @Size(max = 100)
    @Column(name = "DESPERDHUM", length = 100)
    private String desperdhum;
    @Size(max = 100)
    @Column(name = "DESPERDAMB", length = 100)
    private String desperdamb;
    @Size(max = 100)
    @Column(name = "DESPERDMATER", length = 100)
    private String desperdmater;
    @Size(max = 100)
    @Column(name = "DESPERDOTRAS", length = 100)
    private String desperdotras;
    @Size(max = 100)
    @Column(name = "DESPERDDIAS", length = 100)
    private String desperddias;
    @Size(max = 100)
    @Column(name = "DESPERDNUMEROMUERTOS", length = 100)
    private String desperdnumeromuertos;
    @Size(max = 100)
    @Column(name = "DESPERDAFECTACION", length = 100)
    private String desperdafectacion;
    @Size(max = 100)
    @Column(name = "DESPERDESTIMACIONVALOR", length = 100)
    private String desperdestimacionvalor;
    @Size(max = 100)
    @Column(name = "DESPERDGENERAL", length = 100)
    private String desperdgeneral;
    @Size(max = 100)
    @Column(name = "ENTREIDUNO", length = 100)
    private String entreiduno;
    @Size(max = 100)
    @Column(name = "ENTRECARGOUNO", length = 100)
    private String entrecargouno;
    @Size(max = 100)
    @Column(name = "ENTRETELUNO", length = 100)
    private String entreteluno;
    @Size(max = 100)
    @Column(name = "ENTREDESUNO", length = 100)
    private String entredesuno;
    @Size(max = 100)
    @Column(name = "ENTREIDDOS", length = 100)
    private String entreiddos;
    @Size(max = 100)
    @Column(name = "ENTRECARGODOS", length = 100)
    private String entrecargodos;
    @Size(max = 100)
    @Column(name = "ENTRETELDOS", length = 100)
    private String entreteldos;
    @Size(max = 100)
    @Column(name = "ENTREDESDOS", length = 100)
    private String entredesdos;
    @Size(max = 100)
    @Column(name = "ENTREDESAFECTADO", length = 100)
    private String entredesafectado;
    @Size(max = 100)
    @Column(name = "REVCUMPLIO", length = 100)
    private String revcumplio;
    @Size(max = 100)
    @Column(name = "REVCAUSAS", length = 100)
    private String revcausas;
    @Size(max = 100)
    @Column(name = "REVMEDIDAS", length = 100)
    private String revmedidas;
    @Size(max = 100)
    @Column(name = "REGISTROFILENAME1", length = 100)
    private String registrofilename1;
    @Size(max = 100)
    @Column(name = "REGISTROFILENAME2", length = 100)
    private String registrofilename2;
    @Size(max = 100)
    @Column(name = "REGISTROFILENAME3", length = 100)
    private String registrofilename3;
    @Size(max = 1000)
    @Column(name = "IMGFIRMAS", length = 1000)
    private String imgfirmas;
    @Column(name = "IDUSER")
    private BigInteger iduser;
    @Column(name = "DATECREACION")
    @Temporal(TemporalType.DATE)
    private Date datecreacion;
    @Size(max = 4000)
    @Column(name = "USUARIO_CREADOR", length = 4000)
    private String usuarioCreador;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Size(max = 4000)
    @Column(name = "USUARIO_MODIFICADOR", length = 4000)
    private String usuarioModificador;
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @Column(name = "GRUPO_INFORMACION")
    private BigInteger grupoInformacion;

    public Forminvestigacion() {
    }

    public Forminvestigacion(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPreinforme() {
        return preinforme;
    }

    public void setPreinforme(String preinforme) {
        this.preinforme = preinforme;
    }

    public BigInteger getPercent() {
        return percent;
    }

    public void setPercent(BigInteger percent) {
        this.percent = percent;
    }

    public String getNitins() {
        return nitins;
    }

    public void setNitins(String nitins) {
        this.nitins = nitins;
    }

    public String getNitcon() {
        return nitcon;
    }

    public void setNitcon(String nitcon) {
        this.nitcon = nitcon;
    }

    public String getJefaestmayor() {
        return jefaestmayor;
    }

    public void setJefaestmayor(String jefaestmayor) {
        this.jefaestmayor = jefaestmayor;
    }

    public String getUnitac() {
        return unitac;
    }

    public void setUnitac(String unitac) {
        this.unitac = unitac;
    }

    public String getDivcoman() {
        return divcoman;
    }

    public void setDivcoman(String divcoman) {
        this.divcoman = divcoman;
    }

    public String getFuerzatarea() {
        return fuerzatarea;
    }

    public void setFuerzatarea(String fuerzatarea) {
        this.fuerzatarea = fuerzatarea;
    }

    public String getBrigadadireccion() {
        return brigadadireccion;
    }

    public void setBrigadadireccion(String brigadadireccion) {
        this.brigadadireccion = brigadadireccion;
    }

    public String getCede() {
        return cede;
    }

    public void setCede(String cede) {
        this.cede = cede;
    }

    public String getDatenovedad() {
        return datenovedad;
    }

    public void setDatenovedad(String datenovedad) {
        this.datenovedad = datenovedad;
    }

    public String getHoranovedad() {
        return horanovedad;
    }

    public void setHoranovedad(String horanovedad) {
        this.horanovedad = horanovedad;
    }

    public String getMinnovedad() {
        return minnovedad;
    }

    public void setMinnovedad(String minnovedad) {
        this.minnovedad = minnovedad;
    }

    public String getDateanalisis() {
        return dateanalisis;
    }

    public void setDateanalisis(String dateanalisis) {
        this.dateanalisis = dateanalisis;
    }

    public String getZonanovedad() {
        return zonanovedad;
    }

    public void setZonanovedad(String zonanovedad) {
        this.zonanovedad = zonanovedad;
    }

    public String getCoordireccion() {
        return coordireccion;
    }

    public void setCoordireccion(String coordireccion) {
        this.coordireccion = coordireccion;
    }

    public String getPaisnovedad() {
        return paisnovedad;
    }

    public void setPaisnovedad(String paisnovedad) {
        this.paisnovedad = paisnovedad;
    }

    public String getDepnovedad() {
        return depnovedad;
    }

    public void setDepnovedad(String depnovedad) {
        this.depnovedad = depnovedad;
    }

    public String getCiudadnovedad() {
        return ciudadnovedad;
    }

    public void setCiudadnovedad(String ciudadnovedad) {
        this.ciudadnovedad = ciudadnovedad;
    }

    public String getCaraclugar() {
        return caraclugar;
    }

    public void setCaraclugar(String caraclugar) {
        this.caraclugar = caraclugar;
    }

    public String getSitioespecifico() {
        return sitioespecifico;
    }

    public void setSitioespecifico(String sitioespecifico) {
        this.sitioespecifico = sitioespecifico;
    }

    public String getClasenovedad() {
        return clasenovedad;
    }

    public void setClasenovedad(String clasenovedad) {
        this.clasenovedad = clasenovedad;
    }

    public String getNovedadinternafuerza() {
        return novedadinternafuerza;
    }

    public void setNovedadinternafuerza(String novedadinternafuerza) {
        this.novedadinternafuerza = novedadinternafuerza;
    }

    public String getNovedadinternafuerzasub() {
        return novedadinternafuerzasub;
    }

    public void setNovedadinternafuerzasub(String novedadinternafuerzasub) {
        this.novedadinternafuerzasub = novedadinternafuerzasub;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getPartecuerpo() {
        return partecuerpo;
    }

    public void setPartecuerpo(String partecuerpo) {
        this.partecuerpo = partecuerpo;
    }

    public String getPartecuerpodes() {
        return partecuerpodes;
    }

    public void setPartecuerpodes(String partecuerpodes) {
        this.partecuerpodes = partecuerpodes;
    }

    public String getAtencioninmediata() {
        return atencioninmediata;
    }

    public void setAtencioninmediata(String atencioninmediata) {
        this.atencioninmediata = atencioninmediata;
    }

    public String getInfogrado() {
        return infogrado;
    }

    public void setInfogrado(String infogrado) {
        this.infogrado = infogrado;
    }

    public String getInfocargo() {
        return infocargo;
    }

    public void setInfocargo(String infocargo) {
        this.infocargo = infocargo;
    }

    public String getInfoname() {
        return infoname;
    }

    public void setInfoname(String infoname) {
        this.infoname = infoname;
    }

    public String getInfoextrelacion() {
        return infoextrelacion;
    }

    public void setInfoextrelacion(String infoextrelacion) {
        this.infoextrelacion = infoextrelacion;
    }

    public String getInfoextname() {
        return infoextname;
    }

    public void setInfoextname(String infoextname) {
        this.infoextname = infoextname;
    }

    public String getFuenteagente() {
        return fuenteagente;
    }

    public void setFuenteagente(String fuenteagente) {
        this.fuenteagente = fuenteagente;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getOtroagente() {
        return otroagente;
    }

    public void setOtroagente(String otroagente) {
        this.otroagente = otroagente;
    }

    public String getMecalesion() {
        return mecalesion;
    }

    public void setMecalesion(String mecalesion) {
        this.mecalesion = mecalesion;
    }

    public String getNombrereporta() {
        return nombrereporta;
    }

    public void setNombrereporta(String nombrereporta) {
        this.nombrereporta = nombrereporta;
    }

    public String getGradoreporta() {
        return gradoreporta;
    }

    public void setGradoreporta(String gradoreporta) {
        this.gradoreporta = gradoreporta;
    }

    public String getCargoreporta() {
        return cargoreporta;
    }

    public void setCargoreporta(String cargoreporta) {
        this.cargoreporta = cargoreporta;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public String getPersogrado() {
        return persogrado;
    }

    public void setPersogrado(String persogrado) {
        this.persogrado = persogrado;
    }

    public String getPersocargo() {
        return persocargo;
    }

    public void setPersocargo(String persocargo) {
        this.persocargo = persocargo;
    }

    public String getArmacuerpoesp() {
        return armacuerpoesp;
    }

    public void setArmacuerpoesp(String armacuerpoesp) {
        this.armacuerpoesp = armacuerpoesp;
    }

    public String getPersodoc() {
        return persodoc;
    }

    public void setPersodoc(String persodoc) {
        this.persodoc = persodoc;
    }

    public String getDatepersonnac() {
        return datepersonnac;
    }

    public void setDatepersonnac(String datepersonnac) {
        this.datepersonnac = datepersonnac;
    }

    public String getLugarpersonnac() {
        return lugarpersonnac;
    }

    public void setLugarpersonnac(String lugarpersonnac) {
        this.lugarpersonnac = lugarpersonnac;
    }

    public String getDatepersoningre() {
        return datepersoningre;
    }

    public void setDatepersoningre(String datepersoningre) {
        this.datepersoningre = datepersoningre;
    }

    public String getPersoncontingente() {
        return personcontingente;
    }

    public void setPersoncontingente(String personcontingente) {
        this.personcontingente = personcontingente;
    }

    public String getTimeposervicioanos() {
        return timeposervicioanos;
    }

    public void setTimeposervicioanos(String timeposervicioanos) {
        this.timeposervicioanos = timeposervicioanos;
    }

    public String getTimeposerviciomeses() {
        return timeposerviciomeses;
    }

    public void setTimeposerviciomeses(String timeposerviciomeses) {
        this.timeposerviciomeses = timeposerviciomeses;
    }

    public String getTimeposervicioanosunidad() {
        return timeposervicioanosunidad;
    }

    public void setTimeposervicioanosunidad(String timeposervicioanosunidad) {
        this.timeposervicioanosunidad = timeposervicioanosunidad;
    }

    public String getTimeposerviciomesesunidad() {
        return timeposerviciomesesunidad;
    }

    public void setTimeposerviciomesesunidad(String timeposerviciomesesunidad) {
        this.timeposerviciomesesunidad = timeposerviciomesesunidad;
    }

    public String getHoraslaborado() {
        return horaslaborado;
    }

    public void setHoraslaborado(String horaslaborado) {
        this.horaslaborado = horaslaborado;
    }

    public String getMinlaborado() {
        return minlaborado;
    }

    public void setMinlaborado(String minlaborado) {
        this.minlaborado = minlaborado;
    }

    public String getTimeposervicioanoscargo() {
        return timeposervicioanoscargo;
    }

    public void setTimeposervicioanoscargo(String timeposervicioanoscargo) {
        this.timeposervicioanoscargo = timeposervicioanoscargo;
    }

    public String getTimeposerviciomesescargo() {
        return timeposerviciomesescargo;
    }

    public void setTimeposerviciomesescargo(String timeposerviciomesescargo) {
        this.timeposerviciomesescargo = timeposerviciomesescargo;
    }

    public String getPersondireccion() {
        return persondireccion;
    }

    public void setPersondireccion(String persondireccion) {
        this.persondireccion = persondireccion;
    }

    public String getPersonciudad() {
        return personciudad;
    }

    public void setPersonciudad(String personciudad) {
        this.personciudad = personciudad;
    }

    public String getPersontel() {
        return persontel;
    }

    public void setPersontel(String persontel) {
        this.persontel = persontel;
    }

    public String getPersonedad() {
        return personedad;
    }

    public void setPersonedad(String personedad) {
        this.personedad = personedad;
    }

    public String getPersonsexo() {
        return personsexo;
    }

    public void setPersonsexo(String personsexo) {
        this.personsexo = personsexo;
    }

    public String getPersonestado() {
        return personestado;
    }

    public void setPersonestado(String personestado) {
        this.personestado = personestado;
    }

    public String getPersonescolaridad() {
        return personescolaridad;
    }

    public void setPersonescolaridad(String personescolaridad) {
        this.personescolaridad = personescolaridad;
    }

    public String getPersonsalario() {
        return personsalario;
    }

    public void setPersonsalario(String personsalario) {
        this.personsalario = personsalario;
    }

    public String getPersonserviciosalud() {
        return personserviciosalud;
    }

    public void setPersonserviciosalud(String personserviciosalud) {
        this.personserviciosalud = personserviciosalud;
    }

    public String getPersonservicioeps() {
        return personservicioeps;
    }

    public void setPersonservicioeps(String personservicioeps) {
        this.personservicioeps = personservicioeps;
    }

    public String getPersonservicioarl() {
        return personservicioarl;
    }

    public void setPersonservicioarl(String personservicioarl) {
        this.personservicioarl = personservicioarl;
    }

    public String getPersonserviciotipovincu() {
        return personserviciotipovincu;
    }

    public void setPersonserviciotipovincu(String personserviciotipovincu) {
        this.personserviciotipovincu = personserviciotipovincu;
    }

    public String getPersonactividad() {
        return personactividad;
    }

    public void setPersonactividad(String personactividad) {
        this.personactividad = personactividad;
    }

    public String getPersonactividaddurantenovedad() {
        return personactividaddurantenovedad;
    }

    public void setPersonactividaddurantenovedad(String personactividaddurantenovedad) {
        this.personactividaddurantenovedad = personactividaddurantenovedad;
    }

    public String getPersonafp() {
        return personafp;
    }

    public void setPersonafp(String personafp) {
        this.personafp = personafp;
    }

    public String getPersontrabajoespecifico() {
        return persontrabajoespecifico;
    }

    public void setPersontrabajoespecifico(String persontrabajoespecifico) {
        this.persontrabajoespecifico = persontrabajoespecifico;
    }

    public String getPersonexpano() {
        return personexpano;
    }

    public void setPersonexpano(String personexpano) {
        this.personexpano = personexpano;
    }

    public String getPersonexpmeses() {
        return personexpmeses;
    }

    public void setPersonexpmeses(String personexpmeses) {
        this.personexpmeses = personexpmeses;
    }

    public String getPersonexpdias() {
        return personexpdias;
    }

    public void setPersonexpdias(String personexpdias) {
        this.personexpdias = personexpdias;
    }

    public String getPersoncapacitacionesdes() {
        return personcapacitacionesdes;
    }

    public void setPersoncapacitacionesdes(String personcapacitacionesdes) {
        this.personcapacitacionesdes = personcapacitacionesdes;
    }

    public String getDateultdesc() {
        return dateultdesc;
    }

    public void setDateultdesc(String dateultdesc) {
        this.dateultdesc = dateultdesc;
    }

    public String getDateultreentre() {
        return dateultreentre;
    }

    public void setDateultreentre(String dateultreentre) {
        this.dateultreentre = dateultreentre;
    }

    public String getDeshechospresonal() {
        return deshechospresonal;
    }

    public void setDeshechospresonal(String deshechospresonal) {
        this.deshechospresonal = deshechospresonal;
    }

    public String getDesdetalladanovedad() {
        return desdetalladanovedad;
    }

    public void setDesdetalladanovedad(String desdetalladanovedad) {
        this.desdetalladanovedad = desdetalladanovedad;
    }

    public String getDesdetalladahechos() {
        return desdetalladahechos;
    }

    public void setDesdetalladahechos(String desdetalladahechos) {
        this.desdetalladahechos = desdetalladahechos;
    }

    public String getDesfalla() {
        return desfalla;
    }

    public void setDesfalla(String desfalla) {
        this.desfalla = desfalla;
    }

    public String getDesconsecuencias() {
        return desconsecuencias;
    }

    public void setDesconsecuencias(String desconsecuencias) {
        this.desconsecuencias = desconsecuencias;
    }

    public String getDesact() {
        return desact;
    }

    public void setDesact(String desact) {
        this.desact = desact;
    }

    public String getCondiequipodes() {
        return condiequipodes;
    }

    public void setCondiequipodes(String condiequipodes) {
        this.condiequipodes = condiequipodes;
    }

    public String getCondilugardes() {
        return condilugardes;
    }

    public void setCondilugardes(String condilugardes) {
        this.condilugardes = condilugardes;
    }

    public String getCondiambdes() {
        return condiambdes;
    }

    public void setCondiambdes(String condiambdes) {
        this.condiambdes = condiambdes;
    }

    public String getCondiordenpublicodes() {
        return condiordenpublicodes;
    }

    public void setCondiordenpublicodes(String condiordenpublicodes) {
        this.condiordenpublicodes = condiordenpublicodes;
    }

    public String getCondiorgdes() {
        return condiorgdes;
    }

    public void setCondiorgdes(String condiorgdes) {
        this.condiorgdes = condiorgdes;
    }

    public String getCondicomrelaciondes() {
        return condicomrelaciondes;
    }

    public void setCondicomrelaciondes(String condicomrelaciondes) {
        this.condicomrelaciondes = condicomrelaciondes;
    }

    public String getCondicultseguridaddes() {
        return condicultseguridaddes;
    }

    public void setCondicultseguridaddes(String condicultseguridaddes) {
        this.condicultseguridaddes = condicultseguridaddes;
    }

    public String getCondiliderazgodes() {
        return condiliderazgodes;
    }

    public void setCondiliderazgodes(String condiliderazgodes) {
        this.condiliderazgodes = condiliderazgodes;
    }

    public String getCondiprocedimientodes() {
        return condiprocedimientodes;
    }

    public void setCondiprocedimientodes(String condiprocedimientodes) {
        this.condiprocedimientodes = condiprocedimientodes;
    }

    public String getCondirecursosdes() {
        return condirecursosdes;
    }

    public void setCondirecursosdes(String condirecursosdes) {
        this.condirecursosdes = condirecursosdes;
    }

    public String getCondisupervisiondes() {
        return condisupervisiondes;
    }

    public void setCondisupervisiondes(String condisupervisiondes) {
        this.condisupervisiondes = condisupervisiondes;
    }

    public String getCondicompetenciades() {
        return condicompetenciades;
    }

    public void setCondicompetenciades(String condicompetenciades) {
        this.condicompetenciades = condicompetenciades;
    }

    public String getCondicognitivades() {
        return condicognitivades;
    }

    public void setCondicognitivades(String condicognitivades) {
        this.condicognitivades = condicognitivades;
    }

    public String getCondiemocionalesdes() {
        return condiemocionalesdes;
    }

    public void setCondiemocionalesdes(String condiemocionalesdes) {
        this.condiemocionalesdes = condiemocionalesdes;
    }

    public String getCondiconotrosdes() {
        return condiconotrosdes;
    }

    public void setCondiconotrosdes(String condiconotrosdes) {
        this.condiconotrosdes = condiconotrosdes;
    }

    public String getCondifisicasdes() {
        return condifisicasdes;
    }

    public void setCondifisicasdes(String condifisicasdes) {
        this.condifisicasdes = condifisicasdes;
    }

    public String getCondicomportamentalesdes() {
        return condicomportamentalesdes;
    }

    public void setCondicomportamentalesdes(String condicomportamentalesdes) {
        this.condicomportamentalesdes = condicomportamentalesdes;
    }

    public String getConditercerosdes() {
        return conditercerosdes;
    }

    public void setConditercerosdes(String conditercerosdes) {
        this.conditercerosdes = conditercerosdes;
    }

    public String getCondiidcontroldes() {
        return condiidcontroldes;
    }

    public void setCondiidcontroldes(String condiidcontroldes) {
        this.condiidcontroldes = condiidcontroldes;
    }

    public String getCondiusomaterialdes() {
        return condiusomaterialdes;
    }

    public void setCondiusomaterialdes(String condiusomaterialdes) {
        this.condiusomaterialdes = condiusomaterialdes;
    }

    public String getCondimanejotransportedes() {
        return condimanejotransportedes;
    }

    public void setCondimanejotransportedes(String condimanejotransportedes) {
        this.condimanejotransportedes = condimanejotransportedes;
    }

    public String getCondieppkitdes() {
        return condieppkitdes;
    }

    public void setCondieppkitdes(String condieppkitdes) {
        this.condieppkitdes = condieppkitdes;
    }

    public String getCondieppkitdesvehi() {
        return condieppkitdesvehi;
    }

    public void setCondieppkitdesvehi(String condieppkitdesvehi) {
        this.condieppkitdesvehi = condieppkitdesvehi;
    }

    public String getCondiposturasdes() {
        return condiposturasdes;
    }

    public void setCondiposturasdes(String condiposturasdes) {
        this.condiposturasdes = condiposturasdes;
    }

    public String getCondiarmmunexplodes() {
        return condiarmmunexplodes;
    }

    public void setCondiarmmunexplodes(String condiarmmunexplodes) {
        this.condiarmmunexplodes = condiarmmunexplodes;
    }

    public String getCondicompviades() {
        return condicompviades;
    }

    public void setCondicompviades(String condicompviades) {
        this.condicompviades = condicompviades;
    }

    public String getCondiautoinflingidasdes() {
        return condiautoinflingidasdes;
    }

    public void setCondiautoinflingidasdes(String condiautoinflingidasdes) {
        this.condiautoinflingidasdes = condiautoinflingidasdes;
    }

    public String getVialtipovehi() {
        return vialtipovehi;
    }

    public void setVialtipovehi(String vialtipovehi) {
        this.vialtipovehi = vialtipovehi;
    }

    public String getVialplaca() {
        return vialplaca;
    }

    public void setVialplaca(String vialplaca) {
        this.vialplaca = vialplaca;
    }

    public String getVialmarca() {
        return vialmarca;
    }

    public void setVialmarca(String vialmarca) {
        this.vialmarca = vialmarca;
    }

    public String getVialcilindraje() {
        return vialcilindraje;
    }

    public void setVialcilindraje(String vialcilindraje) {
        this.vialcilindraje = vialcilindraje;
    }

    public String getVialdeptres() {
        return vialdeptres;
    }

    public void setVialdeptres(String vialdeptres) {
        this.vialdeptres = vialdeptres;
    }

    public String getVialsoat() {
        return vialsoat;
    }

    public void setVialsoat(String vialsoat) {
        this.vialsoat = vialsoat;
    }

    public String getVialestadolicencia() {
        return vialestadolicencia;
    }

    public void setVialestadolicencia(String vialestadolicencia) {
        this.vialestadolicencia = vialestadolicencia;
    }

    public String getVialdesdanos() {
        return vialdesdanos;
    }

    public void setVialdesdanos(String vialdesdanos) {
        this.vialdesdanos = vialdesdanos;
    }

    public String getVialcostorep() {
        return vialcostorep;
    }

    public void setVialcostorep(String vialcostorep) {
        this.vialcostorep = vialcostorep;
    }

    public String getVialsegtipovehi() {
        return vialsegtipovehi;
    }

    public void setVialsegtipovehi(String vialsegtipovehi) {
        this.vialsegtipovehi = vialsegtipovehi;
    }

    public String getVialsegplaca() {
        return vialsegplaca;
    }

    public void setVialsegplaca(String vialsegplaca) {
        this.vialsegplaca = vialsegplaca;
    }

    public String getVialsegmarca() {
        return vialsegmarca;
    }

    public void setVialsegmarca(String vialsegmarca) {
        this.vialsegmarca = vialsegmarca;
    }

    public String getVialsegcilindraje() {
        return vialsegcilindraje;
    }

    public void setVialsegcilindraje(String vialsegcilindraje) {
        this.vialsegcilindraje = vialsegcilindraje;
    }

    public String getVialsegdeptres() {
        return vialsegdeptres;
    }

    public void setVialsegdeptres(String vialsegdeptres) {
        this.vialsegdeptres = vialsegdeptres;
    }

    public String getVialsegsoat() {
        return vialsegsoat;
    }

    public void setVialsegsoat(String vialsegsoat) {
        this.vialsegsoat = vialsegsoat;
    }

    public String getVialsegestadolicencia() {
        return vialsegestadolicencia;
    }

    public void setVialsegestadolicencia(String vialsegestadolicencia) {
        this.vialsegestadolicencia = vialsegestadolicencia;
    }

    public String getVialsegdesdanos() {
        return vialsegdesdanos;
    }

    public void setVialsegdesdanos(String vialsegdesdanos) {
        this.vialsegdesdanos = vialsegdesdanos;
    }

    public String getVialsegcostorep() {
        return vialsegcostorep;
    }

    public void setVialsegcostorep(String vialsegcostorep) {
        this.vialsegcostorep = vialsegcostorep;
    }

    public String getDesperdhum() {
        return desperdhum;
    }

    public void setDesperdhum(String desperdhum) {
        this.desperdhum = desperdhum;
    }

    public String getDesperdamb() {
        return desperdamb;
    }

    public void setDesperdamb(String desperdamb) {
        this.desperdamb = desperdamb;
    }

    public String getDesperdmater() {
        return desperdmater;
    }

    public void setDesperdmater(String desperdmater) {
        this.desperdmater = desperdmater;
    }

    public String getDesperdotras() {
        return desperdotras;
    }

    public void setDesperdotras(String desperdotras) {
        this.desperdotras = desperdotras;
    }

    public String getDesperddias() {
        return desperddias;
    }

    public void setDesperddias(String desperddias) {
        this.desperddias = desperddias;
    }

    public String getDesperdnumeromuertos() {
        return desperdnumeromuertos;
    }

    public void setDesperdnumeromuertos(String desperdnumeromuertos) {
        this.desperdnumeromuertos = desperdnumeromuertos;
    }

    public String getDesperdafectacion() {
        return desperdafectacion;
    }

    public void setDesperdafectacion(String desperdafectacion) {
        this.desperdafectacion = desperdafectacion;
    }

    public String getDesperdestimacionvalor() {
        return desperdestimacionvalor;
    }

    public void setDesperdestimacionvalor(String desperdestimacionvalor) {
        this.desperdestimacionvalor = desperdestimacionvalor;
    }

    public String getDesperdgeneral() {
        return desperdgeneral;
    }

    public void setDesperdgeneral(String desperdgeneral) {
        this.desperdgeneral = desperdgeneral;
    }

    public String getEntreiduno() {
        return entreiduno;
    }

    public void setEntreiduno(String entreiduno) {
        this.entreiduno = entreiduno;
    }

    public String getEntrecargouno() {
        return entrecargouno;
    }

    public void setEntrecargouno(String entrecargouno) {
        this.entrecargouno = entrecargouno;
    }

    public String getEntreteluno() {
        return entreteluno;
    }

    public void setEntreteluno(String entreteluno) {
        this.entreteluno = entreteluno;
    }

    public String getEntredesuno() {
        return entredesuno;
    }

    public void setEntredesuno(String entredesuno) {
        this.entredesuno = entredesuno;
    }

    public String getEntreiddos() {
        return entreiddos;
    }

    public void setEntreiddos(String entreiddos) {
        this.entreiddos = entreiddos;
    }

    public String getEntrecargodos() {
        return entrecargodos;
    }

    public void setEntrecargodos(String entrecargodos) {
        this.entrecargodos = entrecargodos;
    }

    public String getEntreteldos() {
        return entreteldos;
    }

    public void setEntreteldos(String entreteldos) {
        this.entreteldos = entreteldos;
    }

    public String getEntredesdos() {
        return entredesdos;
    }

    public void setEntredesdos(String entredesdos) {
        this.entredesdos = entredesdos;
    }

    public String getEntredesafectado() {
        return entredesafectado;
    }

    public void setEntredesafectado(String entredesafectado) {
        this.entredesafectado = entredesafectado;
    }

    public String getRevcumplio() {
        return revcumplio;
    }

    public void setRevcumplio(String revcumplio) {
        this.revcumplio = revcumplio;
    }

    public String getRevcausas() {
        return revcausas;
    }

    public void setRevcausas(String revcausas) {
        this.revcausas = revcausas;
    }

    public String getRevmedidas() {
        return revmedidas;
    }

    public void setRevmedidas(String revmedidas) {
        this.revmedidas = revmedidas;
    }

    public String getRegistrofilename1() {
        return registrofilename1;
    }

    public void setRegistrofilename1(String registrofilename1) {
        this.registrofilename1 = registrofilename1;
    }

    public String getRegistrofilename2() {
        return registrofilename2;
    }

    public void setRegistrofilename2(String registrofilename2) {
        this.registrofilename2 = registrofilename2;
    }

    public String getRegistrofilename3() {
        return registrofilename3;
    }

    public void setRegistrofilename3(String registrofilename3) {
        this.registrofilename3 = registrofilename3;
    }

    public String getImgfirmas() {
        return imgfirmas;
    }

    public void setImgfirmas(String imgfirmas) {
        this.imgfirmas = imgfirmas;
    }

    public BigInteger getIduser() {
        return iduser;
    }

    public void setIduser(BigInteger iduser) {
        this.iduser = iduser;
    }

    public Date getDatecreacion() {
        return datecreacion;
    }

    public void setDatecreacion(Date datecreacion) {
        this.datecreacion = datecreacion;
    }

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(String usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public BigInteger getGrupoInformacion() {
        return grupoInformacion;
    }

    public void setGrupoInformacion(BigInteger grupoInformacion) {
        this.grupoInformacion = grupoInformacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Forminvestigacion)) {
            return false;
        }
        Forminvestigacion other = (Forminvestigacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Forminvestigacion[ id=" + id + " ]";
    }
    
}
