/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertli.zero.dao;

import robertli.zero.entity.FileRecord;
import robertli.zero.entity.FileRecordCache;

/**
 *
 * @author Robert Li
 */
public interface FileRecordCacheDao extends GenericDao<FileRecordCache, String> {

    public FileRecordCache saveFileRecordCache(FileRecord fileRecord, byte[] content);
}