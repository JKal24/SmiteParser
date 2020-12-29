package com.astro.smitebasic.objects.gamedata.patch;

import com.astro.smitebasic.objects.InfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatchService implements InfoController<PatchInfo> {

    @Autowired
    private PatchRepository repository;

    @Override
    public void addConnection(PatchInfo info) {
        repository.save(info);
    }

    @Override
    public void addConnections(PatchInfo[] info) {
        for(PatchInfo patchInfo : info)
            addConnection(patchInfo);
    }

    @Override
    public Iterable<PatchInfo> getConnections() {
        return repository.findAll();
    }

    @Override
    public void deleteConnection(PatchInfo info) {
        repository.delete(info);
    }
}
