/*
 * Copyright 2015 Lorenzo Affetti, Giacomo Bresciani, Stefano Cappa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.playfellas.hicaptain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Stefano Cappa on 21/09/15.
 */
public class ObloActivity extends ImmersiveAppCompatActivity {

    @Bind(R.id.chefButton)
    ImageButton chefButton;

    @Bind(R.id.incastri1Button)
    ImageButton incastri1Button;

    @Bind(R.id.incastri2Button)
    ImageButton incastri2Button;

    @Bind(R.id.intruso1Button)
    ImageButton intruso1Button;

    @Bind(R.id.intruso2Button)
    ImageButton intruso2Button;

    @Bind(R.id.superappButton)
    ImageButton superappButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oblo);

        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.chefButton, R.id.incastri1Button, R.id.incastri2Button, R.id.intruso1Button, R.id.intruso2Button, R.id.superappButton})
    public void onClick(View v) {
        startActivity(new Intent(this, FinalActivity.class));
    }
}
