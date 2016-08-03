package io.github.todolist.core.service.impl;
import io.github.todolist.core.domain.FiletypeStat;
import io.github.todolist.core.repository.api.FileTypeRepository;
import io.github.todolist.core.service.api.FileTypeService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Paranjay on 7/26/2016.
 */
@Service
@Transactional
public class FileTypeServiceImpl implements FileTypeService {

    private String fileType = "7z,apk,bat,c,cab,cgi,cmd,COM,dll,doc,docm,exe,hta,inf,jar,js,lnk,msh,MSI,msp,pif,rar,reg,scr,torrent,VBS,zip";

    private String[] fileTypes;

    @Autowired
    private FileTypeRepository fileTypeRepository;

    public JSONObject getAllFiletypeCounts() {
        JSONObject jsonObject = new JSONObject();
        fileTypes = fileType.split(",");
        int n = fileTypes.length;
        long[] counts = new long[n];
        System.out.println("number of file types " + n);
        for(int i = 0; i < n; i++) {
            FiletypeStat filetypeStat = fileTypeRepository.getFiletypeBeanByName(fileTypes[i]);
            if(filetypeStat != null) {
                counts[i] = filetypeStat.getTotalCount();
            } else {
                counts[i] = 0;
            }
            jsonObject.put(fileTypes[i], counts[i]);
        }
        return jsonObject;
    }

}
