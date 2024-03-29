/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.aporestws.service;

import com.soshs.appo.aporestws.entities.LseRegroupeElp;
import com.soshs.appo.aporestws.entities.LseRegroupeElpPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author master05
 */
@Stateless
@Path("wslseregroupeelp")
public class LseRegroupeElpFacadeREST extends AbstractFacade<LseRegroupeElp> {

    @PersistenceContext(unitName = "restPU")
    private EntityManager em;

    private LseRegroupeElpPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codLse=codLseValue;codElp=codElpValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.soshs.appo.aporestws.entities.LseRegroupeElpPK key = new com.soshs.appo.aporestws.entities.LseRegroupeElpPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codLse = map.get("codLse");
        if (codLse != null && !codLse.isEmpty()) {
            key.setCodLse(codLse.get(0));
        }
        java.util.List<String> codElp = map.get("codElp");
        if (codElp != null && !codElp.isEmpty()) {
            key.setCodElp(codElp.get(0));
        }
        return key;
    }

    public LseRegroupeElpFacadeREST() {
        super(LseRegroupeElp.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(LseRegroupeElp entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, LseRegroupeElp entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.soshs.appo.aporestws.entities.LseRegroupeElpPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public LseRegroupeElp find(@PathParam("id") PathSegment id) {
        com.soshs.appo.aporestws.entities.LseRegroupeElpPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<LseRegroupeElp> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<LseRegroupeElp> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
